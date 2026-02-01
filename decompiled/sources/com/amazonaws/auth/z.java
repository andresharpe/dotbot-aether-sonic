package com.amazonaws.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes.dex */
public class z implements InterfaceC1029g {

    /* renamed from: a, reason: collision with root package name */
    private final String f23529a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23530b;

    public z(File file) throws IOException {
        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                if (properties.getProperty("accessKey") != null && properties.getProperty("secretKey") != null) {
                    this.f23529a = properties.getProperty("accessKey");
                    this.f23530b = properties.getProperty("secretKey");
                    try {
                        fileInputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                throw new IllegalArgumentException("The specified file (" + file.getAbsolutePath() + ") doesn't contain the expected properties 'accessKey' and 'secretKey'.");
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        }
        throw new FileNotFoundException("File doesn't exist:  " + file.getAbsolutePath());
    }

    @Override // com.amazonaws.auth.InterfaceC1029g
    public String a() {
        return this.f23529a;
    }

    @Override // com.amazonaws.auth.InterfaceC1029g
    public String c() {
        return this.f23530b;
    }

    public z(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            if (properties.getProperty("accessKey") != null && properties.getProperty("secretKey") != null) {
                this.f23529a = properties.getProperty("accessKey");
                this.f23530b = properties.getProperty("secretKey");
                return;
            }
            throw new IllegalArgumentException("The specified properties data doesn't contain the expected properties 'accessKey' and 'secretKey'.");
        } finally {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
