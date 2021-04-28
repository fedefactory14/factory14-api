package com.factory14.actions.company

import com.factory14.domains.CompanyCharacteristics
import org.json.JSONObject

class SaveCompanyCharacteristics {
    operator fun invoke(companyCharacteristics: CompanyCharacteristics) {
        JSONObject().put("HOLA", "MUNDO")
    }
}