package com.fastcode.dvdrentalclixlogix.application.core.payment;

import com.fastcode.dvdrentalclixlogix.application.core.payment.dto.*;
import com.fastcode.dvdrentalclixlogix.domain.core.customer.CustomerEntity;
import com.fastcode.dvdrentalclixlogix.domain.core.payment.PaymentEntity;
import com.fastcode.dvdrentalclixlogix.domain.core.rental.RentalEntity;
import com.fastcode.dvdrentalclixlogix.domain.core.staff.StaffEntity;
import java.time.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IPaymentMapper {
    PaymentEntity createPaymentInputToPaymentEntity(CreatePaymentInput paymentDto);

    @Mappings(
        {
            @Mapping(source = "entity.customer.customerId", target = "customerId"),
            @Mapping(source = "entity.customer.customerId", target = "customerDescriptiveField"),
            @Mapping(source = "entity.rental.rentalId", target = "rentalId"),
            @Mapping(source = "entity.rental.rentalId", target = "rentalDescriptiveField"),
            @Mapping(source = "entity.staff.staffId", target = "staffId"),
            @Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),
        }
    )
    CreatePaymentOutput paymentEntityToCreatePaymentOutput(PaymentEntity entity);

    PaymentEntity updatePaymentInputToPaymentEntity(UpdatePaymentInput paymentDto);

    @Mappings(
        {
            @Mapping(source = "entity.customer.customerId", target = "customerId"),
            @Mapping(source = "entity.customer.customerId", target = "customerDescriptiveField"),
            @Mapping(source = "entity.rental.rentalId", target = "rentalId"),
            @Mapping(source = "entity.rental.rentalId", target = "rentalDescriptiveField"),
            @Mapping(source = "entity.staff.staffId", target = "staffId"),
            @Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),
        }
    )
    UpdatePaymentOutput paymentEntityToUpdatePaymentOutput(PaymentEntity entity);

    @Mappings(
        {
            @Mapping(source = "entity.customer.customerId", target = "customerId"),
            @Mapping(source = "entity.customer.customerId", target = "customerDescriptiveField"),
            @Mapping(source = "entity.rental.rentalId", target = "rentalId"),
            @Mapping(source = "entity.rental.rentalId", target = "rentalDescriptiveField"),
            @Mapping(source = "entity.staff.staffId", target = "staffId"),
            @Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),
        }
    )
    FindPaymentByIdOutput paymentEntityToFindPaymentByIdOutput(PaymentEntity entity);

    @Mappings({ @Mapping(source = "foundPayment.paymentId", target = "paymentPaymentId") })
    GetRentalOutput rentalEntityToGetRentalOutput(RentalEntity rental, PaymentEntity foundPayment);

    @Mappings({ @Mapping(source = "foundPayment.paymentId", target = "paymentPaymentId") })
    GetStaffOutput staffEntityToGetStaffOutput(StaffEntity staff, PaymentEntity foundPayment);

    @Mappings({ @Mapping(source = "foundPayment.paymentId", target = "paymentPaymentId") })
    GetCustomerOutput customerEntityToGetCustomerOutput(CustomerEntity customer, PaymentEntity foundPayment);
}
