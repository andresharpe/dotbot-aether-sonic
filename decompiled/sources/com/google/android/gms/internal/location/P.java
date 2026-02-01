package com.google.android.gms.internal.location;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class P {
    public static String a(@NullableDecl String str, @NullableDecl Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        String sb;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e4) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str2, (Throwable) e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 9 + name2.length());
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i5] = sb;
            i5++;
        }
        StringBuilder sb5 = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i6, indexOf);
            sb5.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb5.append((CharSequence) str, i6, str.length());
        if (i4 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb5.append(", ");
                sb5.append(objArr[i7]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
