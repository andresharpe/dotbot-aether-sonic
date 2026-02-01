package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public interface c0 extends SpinnerAdapter {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f6141a;

        /* renamed from: b, reason: collision with root package name */
        private final LayoutInflater f6142b;

        /* renamed from: c, reason: collision with root package name */
        private LayoutInflater f6143c;

        public a(@androidx.annotation.N Context context) {
            this.f6141a = context;
            this.f6142b = LayoutInflater.from(context);
        }

        @androidx.annotation.N
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f6143c;
            if (layoutInflater == null) {
                return this.f6142b;
            }
            return layoutInflater;
        }

        @androidx.annotation.P
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f6143c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@androidx.annotation.P Resources.Theme theme) {
            if (theme == null) {
                this.f6143c = null;
            } else if (theme.equals(this.f6141a.getTheme())) {
                this.f6143c = this.f6142b;
            } else {
                this.f6143c = LayoutInflater.from(new androidx.appcompat.view.d(this.f6141a, theme));
            }
        }
    }

    @androidx.annotation.P
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@androidx.annotation.P Resources.Theme theme);
}
