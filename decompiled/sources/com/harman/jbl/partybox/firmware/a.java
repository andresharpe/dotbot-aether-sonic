package com.harman.jbl.partybox.firmware;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f40534a = "DownloadFirmwareOverNetwork";

    public boolean a(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            InputStream inputStream = httpURLConnection.getInputStream();
            File d4 = com.harman.sdk.utils.f.d(str2);
            if (!d4.exists()) {
                d4.createNewFile();
            }
            if (httpURLConnection.getContentLength() == 0) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(d4);
            byte[] bArr = new byte[10240];
            com.harman.log.f.a("OTA_LOG", " OTA File Download started");
            int i4 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                    i4 += read;
                } else {
                    com.harman.log.f.a("OTA_LOG", " OTA Downloaded fileSize =" + i4);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    return true;
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            com.harman.log.f.a("OTA_LOG", " Error in downloading OTA file =" + e4.getMessage());
            return false;
        }
    }
}
