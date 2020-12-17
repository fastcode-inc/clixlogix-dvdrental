import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, Validators } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';

import { CountryService } from '../country.service';
import { ICountry } from '../icountry';
import { BaseDetailsComponent, Globals, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';

@Component({
  selector: 'app-country-details',
  templateUrl: './country-details.component.html',
  styleUrls: ['./country-details.component.scss'],
})
export class CountryDetailsComponent extends BaseDetailsComponent<ICountry> implements OnInit {
  title = 'Country';
  parentUrl = 'country';
  constructor(
    public formBuilder: FormBuilder,
    public router: Router,
    public route: ActivatedRoute,
    public dialog: MatDialog,
    public global: Globals,
    public countryService: CountryService,
    public pickerDialogService: PickerDialogService,
    public errorService: ErrorService,
    public globalPermissionService: GlobalPermissionService
  ) {
    super(formBuilder, router, route, dialog, global, pickerDialogService, countryService, errorService);
  }

  ngOnInit() {
    this.entityName = 'Country';
    this.setAssociations();
    super.ngOnInit();
    this.setForm();
    this.getItem();
    this.setPickerSearchListener();
  }

  setForm() {
    this.itemForm = this.formBuilder.group({
      country: ['', Validators.required],
      countryId: [{ value: '', disabled: true }, Validators.required],
      lastUpdate: ['', Validators.required],
      lastUpdateTime: ['', Validators.required],
    });

    this.fields = [
      {
        name: 'country',
        label: 'country',
        isRequired: true,
        isAutoGenerated: false,
        type: 'string',
      },
      {
        name: 'lastUpdate',
        label: 'last Update',
        isRequired: true,
        isAutoGenerated: false,
        type: 'date',
      },
      {
        name: 'lastUpdateTime',
        label: 'last Update Time',
        isRequired: true,
        isAutoGenerated: false,
        type: 'time',
      },
    ];
  }

  onItemFetched(item: ICountry) {
    this.item = item;
    this.itemForm.patchValue(item);
    this.itemForm.get('lastUpdate').setValue(item.lastUpdate ? new Date(item.lastUpdate) : null);
    this.itemForm.get('lastUpdateTime').setValue(this.countryService.formatDateStringToAMPM(item.lastUpdate));
  }

  setAssociations() {
    this.associations = [
      {
        column: [
          {
            key: 'countryId',
            value: undefined,
            referencedkey: 'countryId',
          },
        ],
        isParent: true,
        table: 'city',
        type: 'OneToMany',
        label: 'citys',
      },
    ];

    this.childAssociations = this.associations.filter((association) => {
      return association.isParent;
    });

    this.parentAssociations = this.associations.filter((association) => {
      return !association.isParent;
    });
  }

  onSubmit() {
    let country = this.itemForm.getRawValue();
    country.lastUpdate = this.dataService.combineDateAndTime(country.lastUpdate, country.lastUpdateTime);
    delete country.lastUpdateTime;
    super.onSubmit(country);
  }
}
