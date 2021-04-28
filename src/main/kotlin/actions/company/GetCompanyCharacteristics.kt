package com.factory14.actions.company

import com.factory14.domains.CategoryEnum.*
import com.factory14.domains.CompanyCharacteristics
import org.json.JSONObject

class GetCompanyCharacteristics() {
    operator fun invoke(companyId:String): JSONObject {
        return CompanyCharacteristics(HOME_AND_KITCHEN).toJson()
    }
}