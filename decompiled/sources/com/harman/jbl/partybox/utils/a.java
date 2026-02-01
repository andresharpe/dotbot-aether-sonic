package com.harman.jbl.partybox.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f46164a = a.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private String f46165b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private FileWriter f46166c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private Context f46167d;

    private final String b() {
        Context context = this.f46167d;
        F.m(context);
        File[] externalFilesDirs = context.getExternalFilesDirs(null);
        if (externalFilesDirs != null && externalFilesDirs.length > 0) {
            String absolutePath = externalFilesDirs[0].getAbsolutePath();
            F.o(absolutePath, "getAbsolutePath(...)");
            return absolutePath;
        }
        return "";
    }

    @l3.e
    public final String a() {
        return this.f46165b;
    }

    public final void c(@l3.d Context context, @l3.d String msg) {
        F.p(context, "context");
        F.p(msg, "msg");
        Log.d(this.f46164a, "init and msg is " + msg);
        this.f46167d = context.getApplicationContext();
        String b4 = b();
        if (b4 == null) {
            Log.e(this.f46164a, "init don't support this source type");
            return;
        }
        String str = "Device_Analytics_Upload_" + System.currentTimeMillis() + ".txt";
        File file = new File(b4);
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            Log.d(this.f46164a, "init mkdirs success: " + mkdirs);
        }
        File file2 = new File(b4, str);
        Log.d(this.f46164a, "init dirName: " + b4 + ",fileName: " + str);
        try {
            if (file2.exists()) {
                boolean delete = file2.delete();
                Log.d(this.f46164a, "init delete success: " + delete);
            }
            Log.d(this.f46164a, "init createNewFile todayFile: " + file2.getAbsolutePath());
            boolean createNewFile = file2.createNewFile();
            Log.d(this.f46164a, "init createNewFile success: " + createNewFile);
            this.f46165b = file2.getPath();
            FileWriter fileWriter = new FileWriter(this.f46165b);
            this.f46166c = fileWriter;
            Log.d(this.f46164a, "write msg and close");
            fileWriter.write(msg);
            fileWriter.close();
        } catch (Exception e4) {
            com.harman.log.f.b(this.f46164a, "Exception:" + e4.getLocalizedMessage());
            Log.e(this.f46164a, "Exception: " + e4.getLocalizedMessage());
            this.f46166c = null;
        }
    }

    public final void d(@l3.e String str) {
        if (this.f46166c == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            FileWriter fileWriter = this.f46166c;
            F.m(fileWriter);
            fileWriter.write(str);
        } catch (Exception e4) {
            com.harman.log.f.b(this.f46164a, "Exception: " + e4.getLocalizedMessage());
            this.f46166c = null;
        }
    }
}
