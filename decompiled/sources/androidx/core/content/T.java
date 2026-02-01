package androidx.core.content;

import android.content.UriMatcher;
import android.net.Uri;

/* loaded from: classes.dex */
public class T {
    private T() {
    }

    @androidx.annotation.N
    public static androidx.core.util.A<Uri> b(@androidx.annotation.N final UriMatcher uriMatcher) {
        return new androidx.core.util.A() { // from class: androidx.core.content.S
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean c4;
                c4 = T.c(uriMatcher, (Uri) obj);
                return c4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(UriMatcher uriMatcher, Uri uri) {
        if (uriMatcher.match(uri) != -1) {
            return true;
        }
        return false;
    }
}
