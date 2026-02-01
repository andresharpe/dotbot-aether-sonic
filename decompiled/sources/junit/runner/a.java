package junit.runner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Properties;
import junit.framework.AssertionFailedError;
import junit.framework.f;
import junit.framework.i;
import junit.framework.k;
import org.junit.internal.l;

/* loaded from: classes2.dex */
public abstract class a implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final String f51524b = "suite";

    /* renamed from: c, reason: collision with root package name */
    private static Properties f51525c = null;

    /* renamed from: d, reason: collision with root package name */
    static int f51526d = k("maxmessage", 500);

    /* renamed from: e, reason: collision with root package name */
    static boolean f51527e = true;

    /* renamed from: a, reason: collision with root package name */
    boolean f51528a = true;

    public static String B(String str) {
        if (f51526d != -1 && str.length() > f51526d) {
            return str.substring(0, f51526d) + "...";
        }
        return str;
    }

    static boolean h(String str) {
        String[] strArr = {"junit.framework.TestCase", "junit.framework.TestResult", "junit.framework.TestSuite", "junit.framework.Assert.", "junit.swingui.TestRunner", "junit.awtui.TestRunner", "junit.textui.TestRunner", "java.lang.reflect.Method.invoke("};
        for (int i4 = 0; i4 < 8; i4++) {
            if (str.indexOf(strArr[i4]) > 0) {
                return true;
            }
        }
        return false;
    }

    public static String i(String str) {
        if (x()) {
            return str;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (!h(readLine)) {
                        printWriter.println(readLine);
                    }
                } else {
                    return stringWriter.toString();
                }
            } catch (Exception unused) {
                return str;
            }
        }
    }

    public static String j(Throwable th) {
        return i(l.g(th));
    }

    public static int k(String str, int i4) {
        String l4 = l(str);
        if (l4 == null) {
            return i4;
        }
        try {
            return Integer.parseInt(l4);
        } catch (NumberFormatException unused) {
            return i4;
        }
    }

    public static String l(String str) {
        return m().getProperty(str);
    }

    protected static Properties m() {
        if (f51525c == null) {
            Properties properties = new Properties();
            f51525c = properties;
            properties.put("loading", L1.a.f1650s3);
            f51525c.put("filterstack", L1.a.f1650s3);
            r();
        }
        return f51525c;
    }

    private static File n() {
        return new File(System.getProperty("user.home"), "junit.properties");
    }

    private static void r() {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(n());
                try {
                    w(new Properties(m()));
                    m().load(fileInputStream);
                    fileInputStream.close();
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 == null) {
                        return;
                    }
                    fileInputStream2.close();
                } catch (SecurityException unused2) {
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 == null) {
                        return;
                    }
                    fileInputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
            }
        } catch (IOException unused5) {
        } catch (SecurityException unused6) {
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public static void t() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(n());
        try {
            m().store(fileOutputStream, "");
        } finally {
            fileOutputStream.close();
        }
    }

    public static void v(String str, String str2) {
        m().put(str, str2);
    }

    protected static void w(Properties properties) {
        f51525c = properties;
    }

    protected static boolean x() {
        if (l("filterstack").equals(L1.a.f1650s3) && f51527e) {
            return false;
        }
        return true;
    }

    public abstract void A(String str);

    protected boolean C() {
        if (l("loading").equals(L1.a.f1650s3) && this.f51528a) {
            return true;
        }
        return false;
    }

    @Override // junit.framework.i
    public synchronized void a(f fVar, Throwable th) {
        z(1, fVar, th);
    }

    @Override // junit.framework.i
    public synchronized void b(f fVar, AssertionFailedError assertionFailedError) {
        z(2, fVar, assertionFailedError);
    }

    @Override // junit.framework.i
    public synchronized void c(f fVar) {
        y(fVar.toString());
    }

    @Override // junit.framework.i
    public synchronized void d(f fVar) {
        A(fVar.toString());
    }

    protected void e() {
    }

    public String f(long j4) {
        return NumberFormat.getInstance().format(j4 / 1000.0d);
    }

    public String g(String str) {
        if (str.startsWith("Default package for")) {
            return str.substring(str.lastIndexOf(".") + 1);
        }
        return str;
    }

    public f o(String str) {
        if (str.length() <= 0) {
            e();
            return null;
        }
        try {
            Class<?> p4 = p(str);
            try {
                Method method = p4.getMethod(f51524b, new Class[0]);
                if (!Modifier.isStatic(method.getModifiers())) {
                    s("Suite() method must be static");
                    return null;
                }
                try {
                    f fVar = (f) method.invoke(null, new Object[0]);
                    if (fVar == null) {
                        return fVar;
                    }
                    e();
                    return fVar;
                } catch (IllegalAccessException e4) {
                    s("Failed to invoke suite():" + e4.toString());
                    return null;
                } catch (InvocationTargetException e5) {
                    s("Failed to invoke suite():" + e5.getTargetException().toString());
                    return null;
                }
            } catch (Exception unused) {
                e();
                return new k(p4);
            }
        } catch (ClassNotFoundException e6) {
            String message = e6.getMessage();
            if (message != null) {
                str = message;
            }
            s("Class not found \"" + str + "\"");
            return null;
        } catch (Exception e7) {
            s("Error: " + e7.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Class<?> p(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    protected String q(String[] strArr) {
        String str = null;
        int i4 = 0;
        while (i4 < strArr.length) {
            if (strArr[i4].equals("-noloading")) {
                u(false);
            } else if (strArr[i4].equals("-nofilterstack")) {
                f51527e = false;
            } else if (strArr[i4].equals("-c")) {
                i4++;
                if (strArr.length > i4) {
                    str = g(strArr[i4]);
                } else {
                    System.out.println("Missing Test class name");
                }
            } else {
                str = strArr[i4];
            }
            i4++;
        }
        return str;
    }

    protected abstract void s(String str);

    public void u(boolean z3) {
        this.f51528a = z3;
    }

    public abstract void y(String str);

    public abstract void z(int i4, f fVar, Throwable th);
}
