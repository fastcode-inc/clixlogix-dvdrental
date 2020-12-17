import { Component, OnInit, Inject } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, Validators } from '@angular/forms';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { CountryService } from '../country.service';
import { ICountry } from '../icountry';
import { Globals, BaseNewComponent, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';

@Component({
  selector: 'app-country-new',
  templateUrl: './country-new.component.html',
  styleUrls: ['./country-new.component.scss'],
})
export class CountryNewComponent extends BaseNewComponent<ICountry> implements OnInit {
  title: string = 'New Country';
  constructor(
    public formBuilder: FormBuilder,
    public router: Router,
    public route: ActivatedRoute,
    public dialog: MatDialog,
    public dialogRef: MatDialogRef<CountryNewComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public global: Globals,
    public pickerDialogService: PickerDialogService,
    public countryService: CountryService,
    public errorService: ErrorService,
    public globalPermissionService: GlobalPermissionService
  ) {
    super(
      formBuilder,
      router,
      route,
      dialog,
      dialogRef,
      data,
      global,
      pickerDialogService,
      countryService,
      errorService
    );
  }

  ngOnInit() {
    this.entityName = 'Country';
    this.setAssociations();
    super.ngOnInit();
    this.setForm();
    this.checkPassedData();
    this.setPickerSearchListener();
  }

  setForm() {
    this.itemForm = this.formBuilder.group({
      country: ['', Validators.required],
      lastUpdate: ['', Validators.required],
      lastUpdateTime: ['12:00 AM', Validators.required],
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

  setAssociations() {
    this.associations = [];
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
