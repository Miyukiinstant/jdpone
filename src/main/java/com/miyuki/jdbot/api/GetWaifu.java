package com.miyuki.jdbot.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import javax.annotation.Nonnull;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetWaifu {

    public static Object getWaifuPic(@Nonnull Object type, @Nonnull Object category) {
        try {
            String _type = type.toString(), _category = category.toString();
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url("https://api.waifu.pics/" + _type + "/" + _category).build();
            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(responseBody, JsonObject.class);
            String url = jsonObject.get("url").getAsString();
            return url;
        } catch (IOException ex) {
            return false;
        }

    }
}
