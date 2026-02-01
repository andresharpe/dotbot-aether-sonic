package com.harman.sdk.utils;

import android.content.Context;
import android.preference.PreferenceManager;
import androidx.annotation.P;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f48740a = "n";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends TypeToken<HashMap<String, String>> {
        a() {
        }
    }

    public static String a(String str) {
        if (str != null) {
            int length = str.length();
            while (length < 2) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(com.harman.jbl.partybox.ui.effectlab.a.f43472q);
                stringBuffer.append(str);
                str = stringBuffer.toString();
                length = str.length();
            }
        }
        return str;
    }

    public static String b(String str) {
        if (str != null && str.length() == 4) {
            return str.substring(2, 4) + str.substring(0, 2);
        }
        return str;
    }

    public static HashMap<String, String> c(String str, Context context) {
        return (HashMap) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(context).getString(str, new Gson().toJson(new HashMap())), new a().getType());
    }

    public static String d(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return String.format("%-6s", sb.toString()).replace(' ', '0');
    }

    public static String e(String str) {
        return str.toString().replaceAll(com.harman.jbl.partybox.ui.effectlab.a.f43472q, "").replaceAll("(.)(?!$)", "$1,");
    }

    @P
    public static String f(Context context, String str) {
        try {
            InputStream open = context.getResources().getAssets().open(str);
            InputStreamReader inputStreamReader = new InputStreamReader(open, StandardCharsets.UTF_8);
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = inputStreamReader.read();
                if (read != -1) {
                    sb.append((char) read);
                } else {
                    inputStreamReader.close();
                    open.close();
                    return sb.toString();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void g(String str, String str2, Context context) {
        HashMap<String, String> c4 = c(str, context);
        if (c4 == null) {
            return;
        }
        c4.remove(str2);
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, new Gson().toJson(c4)).commit();
    }

    public static String h(String str, int i4, int i5) {
        if (str == null || str.isEmpty() || i4 < 0 || i5 - i4 < 0) {
            return "";
        }
        if (i5 > str.length()) {
            return str.substring(i4);
        }
        return str.substring(i4, i5);
    }

    public static ArrayList<String> i(String str, int i4) {
        ArrayList<String> arrayList = new ArrayList<>(((str.length() + i4) - 1) / i4);
        int i5 = 0;
        while (i5 < str.length()) {
            int i6 = i5 + i4;
            String substring = str.substring(i5, Math.min(str.length(), i6));
            if (!substring.equalsIgnoreCase("00")) {
                arrayList.add(substring);
            }
            i5 = i6;
        }
        return arrayList;
    }
}
