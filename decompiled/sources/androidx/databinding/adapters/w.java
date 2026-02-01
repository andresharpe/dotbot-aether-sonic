package androidx.databinding.adapters;

import android.widget.RatingBar;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:rating", type = RatingBar.class)})
/* loaded from: classes.dex */
public class w {

    /* loaded from: classes.dex */
    class a implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RatingBar.OnRatingBarChangeListener f14074a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14075b;

        a(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.o oVar) {
            this.f14074a = onRatingBarChangeListener;
            this.f14075b = oVar;
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f4, boolean z3) {
            RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.f14074a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f4, z3);
            }
            this.f14075b.a();
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void a(RatingBar ratingBar, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new a(onRatingBarChangeListener, oVar));
        }
    }

    @InterfaceC0879d({"android:rating"})
    public static void b(RatingBar ratingBar, float f4) {
        if (ratingBar.getRating() != f4) {
            ratingBar.setRating(f4);
        }
    }
}
