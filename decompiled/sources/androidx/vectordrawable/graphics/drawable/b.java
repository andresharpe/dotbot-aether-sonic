package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import androidx.annotation.W;

/* loaded from: classes.dex */
public interface b extends Animatable {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        Animatable2.AnimationCallback f20274a;

        /* renamed from: androidx.vectordrawable.graphics.drawable.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0182a extends Animatable2.AnimationCallback {
            C0182a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @W(23)
        public Animatable2.AnimationCallback a() {
            if (this.f20274a == null) {
                this.f20274a = new C0182a();
            }
            return this.f20274a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }

    void b(@N a aVar);

    void c();

    boolean d(@N a aVar);
}
