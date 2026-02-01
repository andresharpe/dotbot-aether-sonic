package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.graphics.C0710a;
import androidx.core.view.C;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12539a = "RoundedBitmapDrawableFa";

    /* loaded from: classes.dex */
    private static class a extends i {
        a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.i
        void f(int i4, int i5, int i6, Rect rect, Rect rect2) {
            C.b(i4, i5, i6, rect, rect2, 0);
        }

        @Override // androidx.core.graphics.drawable.i
        public boolean h() {
            Bitmap bitmap = this.f12526a;
            if (bitmap != null && C0710a.c(bitmap)) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.graphics.drawable.i
        public void o(boolean z3) {
            Bitmap bitmap = this.f12526a;
            if (bitmap != null) {
                C0710a.d(bitmap, z3);
                invalidateSelf();
            }
        }
    }

    private j() {
    }

    @N
    public static i a(@N Resources resources, @P Bitmap bitmap) {
        return new h(resources, bitmap);
    }

    @N
    public static i b(@N Resources resources, @N InputStream inputStream) {
        i a4 = a(resources, BitmapFactory.decodeStream(inputStream));
        if (a4.b() == null) {
            Log.w(f12539a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return a4;
    }

    @N
    public static i c(@N Resources resources, @N String str) {
        i a4 = a(resources, BitmapFactory.decodeFile(str));
        if (a4.b() == null) {
            Log.w(f12539a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return a4;
    }
}
