package o0;

import android.content.Context;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f55299c = "Default";

    /* renamed from: d, reason: collision with root package name */
    private static final String f55300d = "awsconfiguration";

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f55301a;

    /* renamed from: b, reason: collision with root package name */
    private String f55302b;

    public b(JSONObject jSONObject) {
        this(jSONObject, f55299c);
    }

    private static int a(Context context) {
        try {
            return context.getResources().getIdentifier(f55300d, "raw", context.getPackageName());
        } catch (Exception e4) {
            throw new RuntimeException("Failed to read awsconfiguration.json please check that it is correctly formed.", e4);
        }
    }

    private void e(Context context, int i4) {
        try {
            Scanner scanner = new Scanner(context.getResources().openRawResource(i4));
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
            scanner.close();
            this.f55301a = new JSONObject(sb.toString());
        } catch (Exception e4) {
            throw new RuntimeException("Failed to read awsconfiguration.json please check that it is correctly formed.", e4);
        }
    }

    public String b() {
        return this.f55302b;
    }

    public String c() {
        try {
            return this.f55301a.getString("UserAgent");
        } catch (JSONException unused) {
            return "";
        }
    }

    public JSONObject d(String str) {
        try {
            JSONObject jSONObject = this.f55301a.getJSONObject(str);
            if (jSONObject.has(this.f55302b)) {
                jSONObject = jSONObject.getJSONObject(this.f55302b);
            }
            return new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
            return null;
        }
    }

    public void f(String str) {
        this.f55302b = str;
    }

    public String toString() {
        return this.f55301a.toString();
    }

    public b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            this.f55302b = str;
            this.f55301a = jSONObject;
            return;
        }
        throw new IllegalArgumentException("JSONObject cannot be null.");
    }

    public b(Context context) {
        this(context, a(context));
    }

    public b(Context context, int i4) {
        this(context, i4, f55299c);
    }

    public b(Context context, int i4, String str) {
        this.f55302b = str;
        e(context, i4);
    }
}
