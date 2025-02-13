package com.fastcode.dvdrentalclixlogix.application.core.language;

import com.fastcode.dvdrentalclixlogix.application.core.language.dto.*;
import com.fastcode.dvdrentalclixlogix.domain.core.language.LanguageEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ILanguageMapper {
    LanguageEntity createLanguageInputToLanguageEntity(CreateLanguageInput languageDto);

    CreateLanguageOutput languageEntityToCreateLanguageOutput(LanguageEntity entity);

    LanguageEntity updateLanguageInputToLanguageEntity(UpdateLanguageInput languageDto);

    UpdateLanguageOutput languageEntityToUpdateLanguageOutput(LanguageEntity entity);

    FindLanguageByIdOutput languageEntityToFindLanguageByIdOutput(LanguageEntity entity);
}
