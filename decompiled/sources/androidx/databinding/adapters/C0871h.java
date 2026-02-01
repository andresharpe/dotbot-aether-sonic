package androidx.databinding.adapters;

import androidx.annotation.RestrictTo;
import androidx.cardview.widget.CardView;
import androidx.databinding.InterfaceC0879d;

@androidx.databinding.h({@androidx.databinding.g(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @androidx.databinding.g(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @androidx.databinding.g(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @androidx.databinding.g(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.databinding.adapters.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0871h {
    @InterfaceC0879d({"contentPadding"})
    public static void a(CardView cardView, int i4) {
        cardView.h(i4, i4, i4, i4);
    }

    @InterfaceC0879d({"contentPaddingBottom"})
    public static void b(CardView cardView, int i4) {
        cardView.h(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i4);
    }

    @InterfaceC0879d({"contentPaddingLeft"})
    public static void c(CardView cardView, int i4) {
        cardView.h(i4, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    @InterfaceC0879d({"contentPaddingRight"})
    public static void d(CardView cardView, int i4) {
        cardView.h(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i4, cardView.getContentPaddingBottom());
    }

    @InterfaceC0879d({"contentPaddingTop"})
    public static void e(CardView cardView, int i4) {
        cardView.h(cardView.getContentPaddingLeft(), i4, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }
}
