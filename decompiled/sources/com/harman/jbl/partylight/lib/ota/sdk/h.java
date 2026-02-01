package com.harman.jbl.partylight.lib.ota.sdk;

import androidx.annotation.j0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f47375a = "DownloadFirmwareOverNetwork";

    @j0
    public boolean a(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            InputStream inputStream = httpURLConnection.getInputStream();
            File file = new File(str2);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (httpURLConnection.getContentLength() == 0) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[10240];
            com.harman.jbl.cd_biz_comm.logger.d.a("OTA_LOG", " OTA File Download started");
            int i4 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                    i4 += read;
                } else {
                    com.harman.jbl.cd_biz_comm.logger.d.a("OTA_LOG", " OTA Downloaded fileSize =" + i4);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    return true;
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            com.harman.jbl.cd_biz_comm.logger.d.a("OTA_LOG", " Error in downloading OTA file =" + e4.getMessage());
            return false;
        }
    }
}
