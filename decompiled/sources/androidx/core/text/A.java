package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.InterfaceC0569l;
import kotlin.H0;

/* loaded from: classes.dex */
public final class A {
    @l3.d
    public static final SpannableStringBuilder a(@l3.d SpannableStringBuilder spannableStringBuilder, @InterfaceC0569l int i4, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i4);
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannableStringBuilder b(@l3.d SpannableStringBuilder spannableStringBuilder, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannedString c(@l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        builderAction.C(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @l3.d
    public static final SpannableStringBuilder d(@l3.d SpannableStringBuilder spannableStringBuilder, @InterfaceC0569l int i4, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i4);
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannableStringBuilder e(@l3.d SpannableStringBuilder spannableStringBuilder, @l3.d Object span, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(span, "span");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(span, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannableStringBuilder f(@l3.d SpannableStringBuilder spannableStringBuilder, @l3.d Object[] spans, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(spans, "spans");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        for (Object obj : spans) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannableStringBuilder g(@l3.d SpannableStringBuilder spannableStringBuilder, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannableStringBuilder h(@l3.d SpannableStringBuilder spannableStringBuilder, float f4, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f4);
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannableStringBuilder i(@l3.d SpannableStringBuilder spannableStringBuilder, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannableStringBuilder j(@l3.d SpannableStringBuilder spannableStringBuilder, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannableStringBuilder k(@l3.d SpannableStringBuilder spannableStringBuilder, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @l3.d
    public static final SpannableStringBuilder l(@l3.d SpannableStringBuilder spannableStringBuilder, @l3.d X2.l<? super SpannableStringBuilder, H0> builderAction) {
        kotlin.jvm.internal.F.p(spannableStringBuilder, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        builderAction.C(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
