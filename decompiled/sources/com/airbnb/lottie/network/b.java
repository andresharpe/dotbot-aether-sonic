package com.airbnb.lottie.network;

import androidx.annotation.N;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class b implements e {
    @Override // com.airbnb.lottie.network.e
    @N
    public c a(@N String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
