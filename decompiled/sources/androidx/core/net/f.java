package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class f {
    @l3.d
    public static final File a(@l3.d Uri uri) {
        F.p(uri, "<this>");
        if (F.g(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    @l3.d
    public static final Uri b(@l3.d File file) {
        F.p(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        F.o(fromFile, "fromFile(this)");
        return fromFile;
    }

    @l3.d
    public static final Uri c(@l3.d String str) {
        F.p(str, "<this>");
        Uri parse = Uri.parse(str);
        F.o(parse, "parse(this)");
        return parse;
    }
}
