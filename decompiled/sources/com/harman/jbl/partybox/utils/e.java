package com.harman.jbl.partybox.utils;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* loaded from: classes2.dex */
public class e {
    public byte[] a(int i4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = null;
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(i4);
            dataOutputStream.flush();
            dataOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return bArr;
        } catch (Exception e4) {
            e4.printStackTrace();
            return bArr;
        }
    }
}
