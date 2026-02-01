package androidx.core.content;

import android.content.SharedPreferences;

@Deprecated
/* loaded from: classes.dex */
public final class L {

    @Deprecated
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private static a f12169b;

        /* renamed from: a, reason: collision with root package name */
        private final C0081a f12170a = new C0081a();

        /* renamed from: androidx.core.content.L$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0081a {
            C0081a() {
            }

            public void a(@androidx.annotation.N SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        @Deprecated
        public static a b() {
            if (f12169b == null) {
                f12169b = new a();
            }
            return f12169b;
        }

        @Deprecated
        public void a(@androidx.annotation.N SharedPreferences.Editor editor) {
            this.f12170a.a(editor);
        }
    }

    private L() {
    }
}
