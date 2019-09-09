

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class HttpURLConnectionExample {

    private Object JsonNode;
    private Object JSONObject;

    Double getLat = 55.733661;
    String getLon = "37.857681";
    String getLang = "«ru_RU»";
    String getLimit = "2";
    String getHours = "true";
    String getExtra = "true";




    public static void main(String[] args) throws Exception {

        HttpURLConnectionExample http = new HttpURLConnectionExample();

        System.out.println("Testing 1 - Send Http GET request");
        http.sendGet();
    }




    private void sendGet() throws Exception {


 //       String url = "https://api.weather.yandex.ru/v1/forecast/?lat=55.733661&lon=37.857681&lang=«ru_RU»&limit=2&hours=true&extra=true";
        String url = "https://api.weather.yandex.ru/v1/forecast/?lat="+ getLat +"&lon=" + getLon + "&lang=" + getLang + "&limit=" + getLimit + "&hours=" + getHours + "&extra=" + getExtra;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("X-Yandex-API-Key", "cf96abee-1083-4c09-9738-67abd189eab1");

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

//        request = Unirest.get(apiHost + apiMethod);
//        getParameters.forEach((key, value) -> request.routeParam(key, value.toString()));
//        GetRequest getRequest = request.headers(headers).basicAuth(login, password);
//        response = getRequest.asString();



        ObjectMapper mapper = new ObjectMapper();
        JSONObject jsonObj = new JSONObject(response);
        Object mappedResponseEntity = mapper.readValue(response.toString(), JSparce.class);
        System.out.println(mappedResponseEntity.toString());

        JSparce asd = (JSparce) mappedResponseEntity;
        asd.getInfo().getLat();
        System.out.println(asd.getInfo().getLat());

        if (asd.getInfo().getLat().equals(getLat)){
            System.out.println("zbc");
        }

//        JSONObject jsonObj = new JSONObject(response);
//
//        System.out.println(jsonObj);
//
//        ObjectMapper mapper = new ObjectMapper();
//        Object request;
//        HttpResponse<com.fasterxml.jackson.databind.JsonNode> response = request.asJson();
//        JSONObject jsonObject = mapper.readValue(String.valueOf(response), JSONObject.class);
//
////        JSONObject asd = new JSONObject(jsonObject);
//
//        System.out.println(jsonObject);
    }
}