package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        F.o(sb2, "toString(...)");
        return sb2;
    }
}
