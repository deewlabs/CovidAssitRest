package com.mphasis.covidassistapi.message;

import com.mphasis.covidassistapi.dao.Hospital;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import java.util.List;

public class GenerateWhatsappMsg implements com.mphasis.covidassistapi.message.GenerateMsg {

    public static final String ACCOUNT_SID = "ACc0d960cf42ce4f49c66bbc4db9cafb4b";
    public static final String AUTH_TOKEN = "0b01a622f5150616cc9e347856320e02";

    @Override
    public void generateMsgsUsingHospialsList(List<Hospital> hospitalList,String number,boolean flag) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(//8861412453
                new com.twilio.type.PhoneNumber("whatsapp:+91"+number),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                generateText(hospitalList, flag))
                .create();

    }

    private String generateText(List<Hospital> hospitalList,boolean flag){
        StringBuilder stringBuilder = new StringBuilder();
        if(hospitalList.size() == 0){
            return "No hospitals are available nearby";
        }else{

            if(flag){
                stringBuilder.append("Ambulance Service Details : \n");
            }else{
                stringBuilder.append("Nearby Hospital Details : \n");
            }
            int index = 1;
            for (Hospital hospital:hospitalList){
                stringBuilder.append( index + ") Hospital : "+hospital.toString()+" \n");
                index++;
            }
        }
        return stringBuilder.toString();
    }
}
