package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1722t3 {
    public static Object a(Object obj) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            Object readObject = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            return readObject;
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream != null) {
                                objectInputStream.close();
                                throw th;
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectInputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
            }
        } catch (IOException | ClassNotFoundException unused) {
        }
        return null;
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        C1285y.l(strArr);
        C1285y.l(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i4 = 0; i4 < min; i4++) {
            String str2 = strArr[i4];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i4];
            }
        }
        return null;
    }

    public static String c(Context context, String str, String str2) {
        C1285y.l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = X1.a(context);
        }
        return X1.b("google_app_id", resources, str2);
    }
}
