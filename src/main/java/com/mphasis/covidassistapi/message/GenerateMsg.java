package com.mphasis.covidassistapi.message;

import com.mphasis.covidassistapi.dao.Hospital;

import java.util.List;

public interface GenerateMsg {

    void generateMsgsUsingHospialsList(List<Hospital> hospitalList,String number);
}
