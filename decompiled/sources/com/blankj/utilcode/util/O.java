package com.blankj.utilcode.util;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.blankj.utilcode.util.H0;
import com.harman.sdk.message.BatteryInfo;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: B, reason: collision with root package name */
    private static SimpleDateFormat f24865B = null;

    /* renamed from: a, reason: collision with root package name */
    public static final int f24868a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f24869b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f24870c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f24871d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final int f24872e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f24873f = 7;

    /* renamed from: h, reason: collision with root package name */
    private static final int f24875h = 16;

    /* renamed from: i, reason: collision with root package name */
    private static final int f24876i = 32;

    /* renamed from: j, reason: collision with root package name */
    private static final int f24877j = 48;

    /* renamed from: m, reason: collision with root package name */
    private static final String f24880m = "┌";

    /* renamed from: n, reason: collision with root package name */
    private static final String f24881n = "├";

    /* renamed from: o, reason: collision with root package name */
    private static final String f24882o = "│ ";

    /* renamed from: p, reason: collision with root package name */
    private static final String f24883p = "└";

    /* renamed from: q, reason: collision with root package name */
    private static final String f24884q = "────────────────────────────────────────────────────────";

    /* renamed from: r, reason: collision with root package name */
    private static final String f24885r = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";

    /* renamed from: s, reason: collision with root package name */
    private static final String f24886s = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";

    /* renamed from: t, reason: collision with root package name */
    private static final String f24887t = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";

    /* renamed from: u, reason: collision with root package name */
    private static final String f24888u = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";

    /* renamed from: v, reason: collision with root package name */
    private static final int f24889v = 1100;

    /* renamed from: w, reason: collision with root package name */
    private static final String f24890w = "log nothing";

    /* renamed from: x, reason: collision with root package name */
    private static final String f24891x = "null";

    /* renamed from: y, reason: collision with root package name */
    private static final String f24892y = "args";

    /* renamed from: z, reason: collision with root package name */
    private static final String f24893z = " ";

    /* renamed from: g, reason: collision with root package name */
    private static final char[] f24874g = {'V', 'D', 'I', 'W', 'E', 'A'};

    /* renamed from: k, reason: collision with root package name */
    private static final String f24878k = System.getProperty("file.separator");

    /* renamed from: l, reason: collision with root package name */
    private static final String f24879l = System.getProperty("line.separator");

    /* renamed from: A, reason: collision with root package name */
    private static final e f24864A = new e(null);

    /* renamed from: C, reason: collision with root package name */
    private static final ExecutorService f24866C = Executors.newSingleThreadExecutor();

    /* renamed from: D, reason: collision with root package name */
    private static final androidx.collection.l<Class, g> f24867D = new androidx.collection.l<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f24894E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ l f24895F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ String f24896G;

        a(int i4, l lVar, String str) {
            this.f24894E = i4;
            this.f24895F = lVar;
            this.f24896G = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            O.Q(this.f24894E, this.f24895F.f24920a, this.f24895F.f24922c + this.f24896G);
        }
    }

    /* loaded from: classes.dex */
    class b implements FilenameFilter {
        b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return O.I(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return O.I(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ File f24897E;

        d(File file) {
            this.f24897E = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f24897E.delete()) {
                Log.e("LogUtils", "delete " + this.f24897E + " failed!");
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private String f24898a;

        /* renamed from: b, reason: collision with root package name */
        private String f24899b;

        /* renamed from: c, reason: collision with root package name */
        private String f24900c;

        /* renamed from: d, reason: collision with root package name */
        private String f24901d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f24902e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f24903f;

        /* renamed from: g, reason: collision with root package name */
        private String f24904g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f24905h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f24906i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f24907j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f24908k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f24909l;

        /* renamed from: m, reason: collision with root package name */
        private int f24910m;

        /* renamed from: n, reason: collision with root package name */
        private int f24911n;

        /* renamed from: o, reason: collision with root package name */
        private int f24912o;

        /* renamed from: p, reason: collision with root package name */
        private int f24913p;

        /* renamed from: q, reason: collision with root package name */
        private int f24914q;

        /* renamed from: r, reason: collision with root package name */
        private String f24915r;

        /* renamed from: s, reason: collision with root package name */
        private f f24916s;

        /* renamed from: t, reason: collision with root package name */
        private i f24917t;

        /* renamed from: u, reason: collision with root package name */
        private j f24918u;

        /* renamed from: v, reason: collision with root package name */
        private H0.a f24919v;

        /* synthetic */ e(a aVar) {
            this();
        }

        public final boolean A() {
            return this.f24906i;
        }

        public final boolean B() {
            return this.f24902e;
        }

        public final boolean C() {
            return this.f24909l;
        }

        public final e D(boolean z3) {
            this.f24908k = z3;
            return this;
        }

        public final e E(int i4) {
            this.f24910m = i4;
            return this;
        }

        public final e F(boolean z3) {
            this.f24903f = z3;
            return this;
        }

        public final e G(File file) {
            String str;
            if (file == null) {
                str = null;
            } else {
                str = file.getAbsolutePath() + O.f24878k;
            }
            this.f24899b = str;
            return this;
        }

        public final e H(String str) {
            if (H0.D0(str)) {
                this.f24899b = null;
            } else {
                if (!str.endsWith(O.f24878k)) {
                    str = str + O.f24878k;
                }
                this.f24899b = str;
            }
            return this;
        }

        public final e I(String str) {
            if (H0.D0(str)) {
                this.f24901d = ".txt";
            } else if (str.startsWith(".")) {
                this.f24901d = str;
            } else {
                this.f24901d = "." + str;
            }
            return this;
        }

        public final e J(int i4) {
            this.f24911n = i4;
            return this;
        }

        public final e K(String str) {
            if (H0.D0(str)) {
                this.f24900c = "util";
            } else {
                this.f24900c = str;
            }
            return this;
        }

        public final e L(f fVar) {
            this.f24916s = fVar;
            return this;
        }

        public final e M(String str) {
            if (H0.D0(str)) {
                this.f24904g = "";
                this.f24905h = true;
            } else {
                this.f24904g = str;
                this.f24905h = false;
            }
            return this;
        }

        public final e N(boolean z3) {
            this.f24907j = z3;
            return this;
        }

        public final e O(boolean z3) {
            this.f24906i = z3;
            return this;
        }

        public final e P(boolean z3) {
            this.f24902e = z3;
            return this;
        }

        public final e Q(i iVar) {
            this.f24917t = iVar;
            return this;
        }

        public final e R(j jVar) {
            this.f24918u = jVar;
            return this;
        }

        public final e S(@androidx.annotation.F(from = 1) int i4) {
            this.f24914q = i4;
            return this;
        }

        public final e T(boolean z3) {
            this.f24909l = z3;
            return this;
        }

        public final e U(@androidx.annotation.F(from = 1) int i4) {
            this.f24912o = i4;
            return this;
        }

        public final e V(@androidx.annotation.F(from = 0) int i4) {
            this.f24913p = i4;
            return this;
        }

        public final e h(String str, String str2) {
            this.f24919v.b(str, str2);
            return this;
        }

        public final e i(Map<String, String> map) {
            this.f24919v.c(map);
            return this;
        }

        public final <T> e j(g<T> gVar) {
            if (gVar != null) {
                O.f24867D.put(O.E(gVar), gVar);
            }
            return this;
        }

        public final char k() {
            return O.f24874g[this.f24910m - 2];
        }

        public final String l() {
            return this.f24898a;
        }

        public final String m() {
            String str = this.f24899b;
            if (str == null) {
                return this.f24898a;
            }
            return str;
        }

        public final String n() {
            return this.f24901d;
        }

        public final char o() {
            return O.f24874g[this.f24911n - 2];
        }

        public final String p() {
            return this.f24900c;
        }

        public final String q() {
            if (H0.D0(this.f24904g)) {
                return "";
            }
            return this.f24904g;
        }

        public final String r() {
            String str = this.f24915r;
            if (str == null) {
                return "";
            }
            return str.replace(":", "_");
        }

        public final int s() {
            return this.f24914q;
        }

        public final int t() {
            return this.f24912o;
        }

        public String toString() {
            String q4;
            StringBuilder sb = new StringBuilder();
            sb.append("process: ");
            sb.append(r());
            sb.append(O.f24879l);
            sb.append("logSwitch: ");
            sb.append(B());
            sb.append(O.f24879l);
            sb.append("consoleSwitch: ");
            sb.append(x());
            sb.append(O.f24879l);
            sb.append("tag: ");
            if (q().equals("")) {
                q4 = O.f24891x;
            } else {
                q4 = q();
            }
            sb.append(q4);
            sb.append(O.f24879l);
            sb.append("headSwitch: ");
            sb.append(A());
            sb.append(O.f24879l);
            sb.append("fileSwitch: ");
            sb.append(y());
            sb.append(O.f24879l);
            sb.append("dir: ");
            sb.append(m());
            sb.append(O.f24879l);
            sb.append("filePrefix: ");
            sb.append(p());
            sb.append(O.f24879l);
            sb.append("borderSwitch: ");
            sb.append(z());
            sb.append(O.f24879l);
            sb.append("singleTagSwitch: ");
            sb.append(C());
            sb.append(O.f24879l);
            sb.append("consoleFilter: ");
            sb.append(k());
            sb.append(O.f24879l);
            sb.append("fileFilter: ");
            sb.append(o());
            sb.append(O.f24879l);
            sb.append("stackDeep: ");
            sb.append(t());
            sb.append(O.f24879l);
            sb.append("stackOffset: ");
            sb.append(u());
            sb.append(O.f24879l);
            sb.append("saveDays: ");
            sb.append(s());
            sb.append(O.f24879l);
            sb.append("formatter: ");
            sb.append(O.f24867D);
            sb.append(O.f24879l);
            sb.append("fileWriter: ");
            sb.append(this.f24916s);
            sb.append(O.f24879l);
            sb.append("onConsoleOutputListener: ");
            sb.append(this.f24917t);
            sb.append(O.f24879l);
            sb.append("onFileOutputListener: ");
            sb.append(this.f24918u);
            sb.append(O.f24879l);
            sb.append("fileExtraHeader: ");
            sb.append(this.f24919v.f());
            return sb.toString();
        }

        public final int u() {
            return this.f24913p;
        }

        public final boolean v() {
            if (this.f24917t != null) {
                return true;
            }
            return false;
        }

        public final boolean w() {
            if (this.f24918u != null) {
                return true;
            }
            return false;
        }

        public final boolean x() {
            return this.f24903f;
        }

        public final boolean y() {
            return this.f24907j;
        }

        public final boolean z() {
            return this.f24908k;
        }

        private e() {
            this.f24900c = "util";
            this.f24901d = ".txt";
            this.f24902e = true;
            this.f24903f = true;
            this.f24904g = "";
            this.f24905h = true;
            this.f24906i = true;
            this.f24907j = false;
            this.f24908k = true;
            this.f24909l = true;
            this.f24910m = 2;
            this.f24911n = 2;
            this.f24912o = 1;
            this.f24913p = 0;
            this.f24914q = -1;
            this.f24915r = H0.N();
            this.f24919v = new H0.a("Log");
            if (H0.A0() && E0.a().getExternalFilesDir(null) != null) {
                this.f24898a = E0.a().getExternalFilesDir(null) + O.f24878k + "log" + O.f24878k;
                return;
            }
            this.f24898a = E0.a().getFilesDir() + O.f24878k + "log" + O.f24878k;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(String str, String str2);
    }

    /* loaded from: classes.dex */
    public static abstract class g<T> {
        public abstract String a(T t3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h {
        private h() {
        }

        private static String a(Object obj) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }

        private static String b(Bundle bundle) {
            String b4;
            Iterator<String> it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb.append(next);
                sb.append('=');
                if (obj instanceof Bundle) {
                    if (obj == bundle) {
                        b4 = "(this Bundle)";
                    } else {
                        b4 = b((Bundle) obj);
                    }
                    sb.append(b4);
                } else {
                    sb.append(O.w(obj));
                }
                if (!it.hasNext()) {
                    sb.append(" }");
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        }

        @androidx.annotation.W(api = 16)
        private static void c(ClipData clipData, StringBuilder sb) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
                return;
            }
            sb.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb.append("H:");
                sb.append(htmlText);
                sb.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb.append("T:");
                sb.append(text);
                sb.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb.append("U:");
                sb.append(uri);
                sb.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent != null) {
                sb.append("I:");
                sb.append(f(intent));
                sb.append("}");
            } else {
                sb.append("NULL");
                sb.append("}");
            }
        }

        private static String d(String str) {
            try {
                int length = str.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = str.charAt(i4);
                    if (charAt == '{') {
                        return new JSONObject(str).toString(2);
                    }
                    if (charAt == '[') {
                        return new JSONArray(str).toString(2);
                    }
                    if (!Character.isWhitespace(charAt)) {
                        return str;
                    }
                }
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            return str;
        }

        private static String e(String str) {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
                newTransformer.setOutputProperty("indent", "yes");
                newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                newTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + O.f24879l);
            } catch (Exception e4) {
                e4.printStackTrace();
                return str;
            }
        }

        private static String f(Intent intent) {
            boolean z3;
            String f4;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z4 = false;
            boolean z5 = true;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z3 = false;
            } else {
                z3 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str : categories) {
                    if (!z5) {
                        sb.append(',');
                    }
                    sb.append(str);
                    z5 = false;
                }
                sb.append("]");
                z3 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(data);
                z3 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z3 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z3 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str2);
                z3 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z3 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z3 = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z3) {
                    sb.append(' ');
                }
                c(clipData, sb);
                z3 = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(b(extras));
                sb.append('}');
            } else {
                z4 = z3;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("sel={");
                if (selector == intent) {
                    f4 = "(this Intent)";
                } else {
                    f4 = f(selector);
                }
                sb.append(f4);
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
        }

        private static String g(Object obj) {
            if (obj instanceof CharSequence) {
                return H0.G(obj.toString());
            }
            try {
                return H0.U().toJson(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }

        static String h(Object obj) {
            return i(obj, -1);
        }

        static String i(Object obj, int i4) {
            if (obj.getClass().isArray()) {
                return a(obj);
            }
            if (obj instanceof Throwable) {
                return H0.T((Throwable) obj);
            }
            if (obj instanceof Bundle) {
                return b((Bundle) obj);
            }
            if (obj instanceof Intent) {
                return f((Intent) obj);
            }
            if (i4 == 32) {
                return g(obj);
            }
            if (i4 == 48) {
                return e(obj.toString());
            }
            return obj.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(int i4, String str, String str2);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(String str, String str2);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface k {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        String f24920a;

        /* renamed from: b, reason: collision with root package name */
        String[] f24921b;

        /* renamed from: c, reason: collision with root package name */
        String f24922c;

        l(String str, String[] strArr, String str2) {
            this.f24920a = str;
            this.f24921b = strArr;
            this.f24922c = str2;
        }
    }

    private O() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static String A(Date date) {
        String substring = D().format(date).substring(0, 10);
        StringBuilder sb = new StringBuilder();
        e eVar = f24864A;
        sb.append(eVar.m());
        sb.append(eVar.p());
        sb.append("_");
        sb.append(substring);
        sb.append("_");
        sb.append(eVar.r());
        sb.append(eVar.n());
        return sb.toString();
    }

    private static String B(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] split = className.split("\\.");
        if (split.length > 0) {
            className = split[split.length - 1];
        }
        int indexOf = className.indexOf(36);
        if (indexOf != -1) {
            className = className.substring(0, indexOf);
        }
        return className + ".java";
    }

    public static List<File> C() {
        File file = new File(f24864A.m());
        if (!file.exists()) {
            return new ArrayList();
        }
        File[] listFiles = file.listFiles(new b());
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, listFiles);
        return arrayList;
    }

    private static SimpleDateFormat D() {
        if (f24865B == null) {
            f24865B = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return f24865B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Class E(g<T> gVar) {
        Type genericSuperclass;
        Type[] genericInterfaces = gVar.getClass().getGenericInterfaces();
        if (genericInterfaces.length == 1) {
            genericSuperclass = genericInterfaces[0];
        } else {
            genericSuperclass = gVar.getClass().getGenericSuperclass();
        }
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        while (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        String obj = type.toString();
        if (obj.startsWith("class ")) {
            obj = obj.substring(6);
        } else if (obj.startsWith("interface ")) {
            obj = obj.substring(10);
        }
        try {
            return Class.forName(obj);
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static void F(Object... objArr) {
        N(4, f24864A.q(), objArr);
    }

    public static void G(String str, Object... objArr) {
        N(4, str, objArr);
    }

    private static void H(String str, String str2) {
        e eVar = f24864A;
        if (eVar.f24916s == null) {
            H0.j1(str, str2, true);
        } else {
            eVar.f24916s.a(str, str2);
        }
        if (eVar.f24918u != null) {
            eVar.f24918u.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean I(String str) {
        return str.matches("^" + f24864A.p() + "_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
    }

    public static void J(int i4, Object obj) {
        N(i4 | 32, f24864A.q(), obj);
    }

    public static void K(int i4, String str, Object obj) {
        N(i4 | 32, str, obj);
    }

    public static void L(Object obj) {
        N(35, f24864A.q(), obj);
    }

    public static void M(String str, Object obj) {
        N(35, str, obj);
    }

    public static void N(int i4, String str, Object... objArr) {
        e eVar = f24864A;
        if (!eVar.B()) {
            return;
        }
        int i5 = i4 & 15;
        int i6 = i4 & BatteryInfo.f48169K;
        if (eVar.x() || eVar.y() || i6 == 16) {
            if (i5 < eVar.f24910m && i5 < eVar.f24911n) {
                return;
            }
            l Z3 = Z(str);
            String X3 = X(i6, objArr);
            if (eVar.x() && i6 != 16 && i5 >= eVar.f24910m) {
                P(i5, Z3.f24920a, Z3.f24921b, X3);
            }
            if ((eVar.y() || i6 == 16) && i5 >= eVar.f24911n) {
                f24866C.execute(new a(i5, Z3, X3));
            }
        }
    }

    private static void O(int i4, String str, String str2) {
        Log.println(i4, str, str2);
        e eVar = f24864A;
        if (eVar.f24917t != null) {
            eVar.f24917t.a(i4, str, str2);
        }
    }

    private static void P(int i4, String str, String[] strArr, String str2) {
        if (f24864A.C()) {
            V(i4, str, Y(i4, str, strArr, str2));
            return;
        }
        R(i4, str, true);
        T(i4, str, strArr);
        U(i4, str, str2);
        R(i4, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(int i4, String str, String str2) {
        Date date = new Date();
        String format = D().format(date);
        String substring = format.substring(0, 10);
        String A3 = A(date);
        if (!k(A3, substring)) {
            Log.e("LogUtils", "create " + A3 + " failed!");
            return;
        }
        H(A3, format.substring(11) + f24874g[i4 - 2] + "/" + str + str2 + f24879l);
    }

    private static void R(int i4, String str, boolean z3) {
        String str2;
        if (f24864A.z()) {
            if (z3) {
                str2 = f24886s;
            } else {
                str2 = f24888u;
            }
            O(i4, str, str2);
        }
    }

    private static void S(String str, String str2) {
        e eVar = f24864A;
        eVar.f24919v.a("Date of Log", str2);
        H(str, eVar.f24919v.toString());
    }

    private static void T(int i4, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (f24864A.z()) {
                    str2 = f24882o + str2;
                }
                O(i4, str, str2);
            }
            if (f24864A.z()) {
                O(i4, str, f24887t);
            }
        }
    }

    private static void U(int i4, String str, String str2) {
        int length = str2.length();
        int i5 = length / f24889v;
        if (i5 > 0) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                int i8 = i7 + f24889v;
                W(i4, str, str2.substring(i7, i8));
                i6++;
                i7 = i8;
            }
            if (i7 != length) {
                W(i4, str, str2.substring(i7, length));
                return;
            }
            return;
        }
        W(i4, str, str2);
    }

    private static void V(int i4, String str, String str2) {
        int i5;
        int length = str2.length();
        e eVar = f24864A;
        boolean z3 = eVar.z();
        int i6 = f24889v;
        if (z3) {
            i5 = (length - 113) / f24889v;
        } else {
            i5 = length / f24889v;
        }
        if (i5 > 0) {
            int i7 = 1;
            if (eVar.z()) {
                O(i4, str, str2.substring(0, f24889v) + f24879l + f24888u);
                while (i7 < i5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(f24893z);
                    String str3 = f24879l;
                    sb.append(str3);
                    sb.append(f24886s);
                    sb.append(str3);
                    sb.append(f24882o);
                    int i8 = i6 + f24889v;
                    sb.append(str2.substring(i6, i8));
                    sb.append(str3);
                    sb.append(f24888u);
                    O(i4, str, sb.toString());
                    i7++;
                    i6 = i8;
                }
                if (i6 != length - 113) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f24893z);
                    String str4 = f24879l;
                    sb2.append(str4);
                    sb2.append(f24886s);
                    sb2.append(str4);
                    sb2.append(f24882o);
                    sb2.append(str2.substring(i6, length));
                    O(i4, str, sb2.toString());
                    return;
                }
                return;
            }
            O(i4, str, str2.substring(0, f24889v));
            while (i7 < i5) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f24893z);
                sb3.append(f24879l);
                int i9 = i6 + f24889v;
                sb3.append(str2.substring(i6, i9));
                O(i4, str, sb3.toString());
                i7++;
                i6 = i9;
            }
            if (i6 != length) {
                O(i4, str, f24893z + f24879l + str2.substring(i6, length));
                return;
            }
            return;
        }
        O(i4, str, str2);
    }

    private static void W(int i4, String str, String str2) {
        if (!f24864A.z()) {
            O(i4, str, str2);
            return;
        }
        for (String str3 : str2.split(f24879l)) {
            O(i4, str, f24882o + str3);
        }
    }

    private static String X(int i4, Object... objArr) {
        String str;
        if (objArr != null) {
            if (objArr.length == 1) {
                str = v(i4, objArr[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                int length = objArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    Object obj = objArr[i5];
                    sb.append(f24892y);
                    sb.append("[");
                    sb.append(i5);
                    sb.append("]");
                    sb.append(" = ");
                    sb.append(w(obj));
                    sb.append(f24879l);
                }
                str = sb.toString();
            }
        } else {
            str = f24891x;
        }
        if (str.length() == 0) {
            return f24890w;
        }
        return str;
    }

    private static String Y(int i4, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        if (f24864A.z()) {
            sb.append(f24893z);
            String str3 = f24879l;
            sb.append(str3);
            sb.append(f24886s);
            sb.append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb.append(f24882o);
                    sb.append(str4);
                    sb.append(f24879l);
                }
                sb.append(f24887t);
                sb.append(f24879l);
            }
            String[] split = str2.split(f24879l);
            int length = split.length;
            while (i5 < length) {
                String str5 = split[i5];
                sb.append(f24882o);
                sb.append(str5);
                sb.append(f24879l);
                i5++;
            }
            sb.append(f24888u);
        } else {
            if (strArr != null) {
                sb.append(f24893z);
                sb.append(f24879l);
                int length2 = strArr.length;
                while (i5 < length2) {
                    sb.append(strArr[i5]);
                    sb.append(f24879l);
                    i5++;
                }
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private static l Z(String str) {
        e eVar = f24864A;
        if (!eVar.f24905h && !eVar.A()) {
            str = eVar.q();
        } else {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int u3 = eVar.u() + 3;
            if (u3 >= stackTrace.length) {
                String B3 = B(stackTrace[3]);
                if (eVar.f24905h && H0.D0(str)) {
                    int indexOf = B3.indexOf(46);
                    if (indexOf == -1) {
                        str = B3;
                    } else {
                        str = B3.substring(0, indexOf);
                    }
                }
                return new l(str, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[u3];
            String B4 = B(stackTraceElement);
            if (eVar.f24905h && H0.D0(str)) {
                int indexOf2 = B4.indexOf(46);
                if (indexOf2 == -1) {
                    str = B4;
                } else {
                    str = B4.substring(0, indexOf2);
                }
            }
            if (eVar.A()) {
                String name = Thread.currentThread().getName();
                String formatter = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), B4, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String str2 = " [" + formatter + "]: ";
                if (eVar.t() <= 1) {
                    return new l(str, new String[]{formatter}, str2);
                }
                int min = Math.min(eVar.t(), stackTrace.length - u3);
                String[] strArr = new String[min];
                strArr[0] = formatter;
                int length = name.length() + 2;
                String formatter2 = new Formatter().format("%" + length + "s", "").toString();
                for (int i4 = 1; i4 < min; i4++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i4 + u3];
                    strArr[i4] = new Formatter().format("%s%s.%s(%s:%d)", formatter2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), B(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new l(str, strArr, str2);
            }
        }
        return new l(str, null, ": ");
    }

    public static void a(Object... objArr) {
        N(7, f24864A.q(), objArr);
    }

    public static void a0(Object... objArr) {
        N(2, f24864A.q(), objArr);
    }

    public static void b(String str, Object... objArr) {
        N(7, str, objArr);
    }

    public static void b0(String str, Object... objArr) {
        N(2, str, objArr);
    }

    public static void c0(Object... objArr) {
        N(5, f24864A.q(), objArr);
    }

    public static void d0(String str, Object... objArr) {
        N(5, str, objArr);
    }

    public static void e0(int i4, String str) {
        N(i4 | 48, f24864A.q(), str);
    }

    public static void f0(int i4, String str, String str2) {
        N(i4 | 48, str, str2);
    }

    public static void g0(String str) {
        N(51, f24864A.q(), str);
    }

    public static void h0(String str, String str2) {
        N(51, str, str2);
    }

    private static boolean k(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!H0.s(file.getParentFile())) {
            return false;
        }
        try {
            n(str, str2);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                S(str, str2);
            }
            return createNewFile;
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static void l(Object... objArr) {
        N(3, f24864A.q(), objArr);
    }

    public static void m(String str, Object... objArr) {
        N(3, str, objArr);
    }

    private static void n(String str, String str2) {
        File[] listFiles;
        if (f24864A.s() > 0 && (listFiles = new File(str).getParentFile().listFiles(new c())) != null && listFiles.length > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat.parse(str2).getTime() - (r0.s() * 86400000);
                for (File file : listFiles) {
                    String name = file.getName();
                    name.length();
                    if (simpleDateFormat.parse(u(name)).getTime() <= time) {
                        f24866C.execute(new d(file));
                    }
                }
            } catch (ParseException e4) {
                e4.printStackTrace();
            }
        }
    }

    public static void o(Object... objArr) {
        N(6, f24864A.q(), objArr);
    }

    public static void p(String str, Object... objArr) {
        N(6, str, objArr);
    }

    public static void q(int i4, Object obj) {
        N(i4 | 16, f24864A.q(), obj);
    }

    public static void r(int i4, String str, Object obj) {
        N(i4 | 16, str, obj);
    }

    public static void s(Object obj) {
        N(19, f24864A.q(), obj);
    }

    public static void t(String str, Object obj) {
        N(19, str, obj);
    }

    private static String u(String str) {
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }

    private static String v(int i4, Object obj) {
        if (obj == null) {
            return f24891x;
        }
        if (i4 == 32) {
            return h.i(obj, 32);
        }
        if (i4 == 48) {
            return h.i(obj, 48);
        }
        return w(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w(Object obj) {
        g gVar;
        if (obj == null) {
            return f24891x;
        }
        androidx.collection.l<Class, g> lVar = f24867D;
        if (!lVar.isEmpty() && (gVar = lVar.get(x(obj))) != null) {
            return gVar.a(obj);
        }
        return h.h(obj);
    }

    private static Class x(Object obj) {
        String obj2;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass() || cls.isSynthetic()) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces.length == 1) {
                Type type = genericInterfaces[0];
                while (type instanceof ParameterizedType) {
                    type = ((ParameterizedType) type).getRawType();
                }
                obj2 = type.toString();
            } else {
                Type genericSuperclass = cls.getGenericSuperclass();
                while (genericSuperclass instanceof ParameterizedType) {
                    genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                }
                obj2 = genericSuperclass.toString();
            }
            if (obj2.startsWith("class ")) {
                obj2 = obj2.substring(6);
            } else if (obj2.startsWith("interface ")) {
                obj2 = obj2.substring(10);
            }
            try {
                return Class.forName(obj2);
            } catch (ClassNotFoundException e4) {
                e4.printStackTrace();
            }
        }
        return cls;
    }

    public static e y() {
        return f24864A;
    }

    public static String z() {
        return A(new Date());
    }
}
