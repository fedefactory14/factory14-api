package com.factory14.actions.company

import org.json.JSONObject

class CalculateCompanyPrice {
    operator fun invoke(companyId:String): JSONObject {
        return JSONObject().put("price", 4.7)
    }
}