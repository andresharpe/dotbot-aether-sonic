package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public class c {
    public static void a(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + str2 + "  " + layoutParams.getClass().getName());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }

    public static void b(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            System.out.println(str2 + "     " + k(childAt));
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Field[] fields = layoutParams.getClass().getFields();
            for (int i5 = 0; i5 < fields.length; i5++) {
                Field field = fields[i5];
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void c(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        System.out.println(str + "------------- " + cls.getName() + " --------------------");
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals(com.harman.jbl.partybox.ui.effectlab.a.f43472q)) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(str + "------------- " + cls.getSimpleName() + " --------------------");
    }

    public static String d(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String e(int i4) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i4 + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String f() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String g() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String h() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String i(Context context, int i4) {
        if (i4 != -1) {
            try {
                return context.getResources().getResourceEntryName(i4);
            } catch (Exception unused) {
                return "?" + i4;
            }
        }
        return "UNKNOWN";
    }

    public static String j(Context context, int[] iArr) {
        String str;
        String str2;
        try {
            String str3 = iArr.length + "[";
            for (int i4 = 0; i4 < iArr.length; i4++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                if (i4 != 0) {
                    str = " ";
                } else {
                    str = "";
                }
                sb.append(str);
                String sb2 = sb.toString();
                try {
                    str2 = context.getResources().getResourceEntryName(iArr[i4]);
                } catch (Resources.NotFoundException unused) {
                    str2 = "? " + iArr[i4] + " ";
                }
                str3 = sb2 + str2;
            }
            return str3 + "]";
        } catch (Exception e4) {
            Log.v("DEBUG", e4.toString());
            return "UNKNOWN";
        }
    }

    public static String k(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String l(s sVar, int i4) {
        return m(sVar, i4, -1);
    }

    public static String m(s sVar, int i4, int i5) {
        int length;
        if (i4 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = sVar.getContext().getResources().getResourceEntryName(i4);
        if (i5 != -1) {
            if (resourceEntryName.length() > i5) {
                resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
            }
            if (resourceEntryName.length() > i5 && (length = resourceEntryName.replaceAll("[^_]", "").length()) > 0) {
                return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i5) / length).toString().replace((char) 0, '.') + "_", "_");
            }
            return resourceEntryName;
        }
        return resourceEntryName;
    }

    public static void n(String str, String str2, int i4) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i4, stackTrace.length - 1);
        String str3 = " ";
        for (int i5 = 1; i5 <= min; i5++) {
            StackTraceElement stackTraceElement = stackTrace[i5];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i5].getFileName() + ":" + stackTrace[i5].getLineNumber() + ") " + stackTrace[i5].getMethodName()) + str3);
        }
    }

    public static void o(String str, int i4) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i4, stackTrace.length - 1);
        String str2 = " ";
        for (int i5 = 1; i5 <= min; i5++) {
            StackTraceElement stackTraceElement = stackTrace[i5];
            String str3 = ".(" + stackTrace[i5].getFileName() + ":" + stackTrace[i5].getLineNumber() + ") ";
            str2 = str2 + " ";
            System.out.println(str + str2 + str3 + str2);
        }
    }
}
