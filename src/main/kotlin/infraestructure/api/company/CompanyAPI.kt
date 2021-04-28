package com.factory14.infraestructure.api.company

import com.factory14.actions.company.CalculateCompanyPrice
import com.factory14.actions.company.GetCompanyCharacteristics
import com.factory14.actions.company.SaveCompanyCharacteristics
import com.factory14.domains.CategoryEnum
import com.factory14.domains.CompanyCharacteristics
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class CompanyAPI {

    private val getCompanyCharacteristics = GetCompanyCharacteristics()
    private val saveCompanyCharacteristics = SaveCompanyCharacteristics()
    private val calculateCompanyPrice = CalculateCompanyPrice()

    @GetMapping(
        value = ["/v1/company/{companyId}/characteristics"],
        produces = ["application/json; charset=UTF-8"])
    fun getCharacteristics(@PathVariable("companyId") companyId: String): String {
        return getCompanyCharacteristics(companyId).toString()
    }

    @GetMapping(
        value = ["/v1/company/{companyId}/price"],
        produces = ["application/json; charset=UTF-8"])
    fun getPrice(@PathVariable("companyId") companyId: String): String {

        return calculateCompanyPrice(companyId).toString()
    }

    @PostMapping(
        value= ["/v1/company/characteristics"],
        consumes = [MediaType.APPLICATION_JSON_VALUE]
        )
    @ResponseStatus(HttpStatus.CREATED)
    fun saveCharacteristics(
        @RequestBody companyCharacteristics: CompanyCharacteristics) {
        saveCompanyCharacteristics(CompanyCharacteristics(CategoryEnum.HOME_AND_KITCHEN))
    }

}