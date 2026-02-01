package androidx.core.net;

import android.net.Uri;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.util.u;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.F;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f12705b = "mailto:";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12706c = "mailto";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12707d = "to";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12708e = "body";

    /* renamed from: f, reason: collision with root package name */
    private static final String f12709f = "cc";

    /* renamed from: g, reason: collision with root package name */
    private static final String f12710g = "bcc";

    /* renamed from: h, reason: collision with root package name */
    private static final String f12711h = "subject";

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, String> f12712a = new HashMap<>();

    private c() {
    }

    public static boolean g(@P Uri uri) {
        if (uri != null && f12706c.equals(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public static boolean h(@P String str) {
        if (str != null && str.startsWith(f12705b)) {
            return true;
        }
        return false;
    }

    @N
    public static c i(@N Uri uri) throws ParseException {
        return j(uri.toString());
    }

    @N
    public static c j(@N String str) throws ParseException {
        String decode;
        String substring;
        String str2;
        u.l(str);
        if (h(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                decode = Uri.decode(str.substring(7));
                substring = null;
            } else {
                decode = Uri.decode(str.substring(7, indexOf2));
                substring = str.substring(indexOf2 + 1);
            }
            c cVar = new c();
            if (substring != null) {
                for (String str3 : substring.split("&")) {
                    String[] split = str3.split("=", 2);
                    if (split.length != 0) {
                        String lowerCase = Uri.decode(split[0]).toLowerCase(Locale.ROOT);
                        if (split.length > 1) {
                            str2 = Uri.decode(split[1]);
                        } else {
                            str2 = null;
                        }
                        cVar.f12712a.put(lowerCase, str2);
                    }
                }
            }
            String f4 = cVar.f();
            if (f4 != null) {
                decode = decode + ", " + f4;
            }
            cVar.f12712a.put("to", decode);
            return cVar;
        }
        throw new ParseException("Not a mailto scheme");
    }

    @P
    public String a() {
        return this.f12712a.get(f12710g);
    }

    @P
    public String b() {
        return this.f12712a.get(f12708e);
    }

    @P
    public String c() {
        return this.f12712a.get(f12709f);
    }

    @P
    public Map<String, String> d() {
        return this.f12712a;
    }

    @P
    public String e() {
        return this.f12712a.get(f12711h);
    }

    @P
    public String f() {
        return this.f12712a.get("to");
    }

    @N
    public String toString() {
        StringBuilder sb = new StringBuilder(f12705b);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.f12712a.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append(F.f52748d);
        }
        return sb.toString();
    }
}
