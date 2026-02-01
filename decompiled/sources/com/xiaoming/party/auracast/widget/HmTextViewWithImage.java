package com.xiaoming.party.auracast.widget;

import android.content.Context;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.InterfaceC0578v;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class HmTextViewWithImage extends AppCompatTextView {

    /* renamed from: L, reason: collision with root package name */
    private static final Spannable.Factory f49065L = Spannable.Factory.getInstance();

    /* renamed from: M, reason: collision with root package name */
    private static int f49066M = 0;

    public HmTextViewWithImage(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }

    private static void u(Context context, Spannable spannable) {
        Matcher matcher = Pattern.compile("\\Q[img src=\\E([a-zA-Z0-9_]+?)\\Q/]\\E").matcher(spannable);
        while (matcher.find()) {
            ImageSpan[] imageSpanArr = (ImageSpan[]) spannable.getSpans(matcher.start(), matcher.end(), ImageSpan.class);
            int length = imageSpanArr.length;
            boolean z3 = false;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    ImageSpan imageSpan = imageSpanArr[i4];
                    if (spannable.getSpanStart(imageSpan) < matcher.start() || spannable.getSpanEnd(imageSpan) > matcher.end()) {
                        break;
                    }
                    spannable.removeSpan(imageSpan);
                    i4++;
                } else {
                    z3 = true;
                    break;
                }
            }
            int identifier = context.getResources().getIdentifier(spannable.subSequence(matcher.start(1), matcher.end(1)).toString().trim(), "drawable", context.getPackageName());
            if (identifier == 0) {
                identifier = f49066M;
            }
            if (identifier != 0 && z3) {
                spannable.setSpan(new ImageSpan(context, identifier, 2), matcher.start(), matcher.end(), 33);
            }
        }
    }

    private static Spannable v(Context context, CharSequence charSequence) {
        Spannable newSpannable = f49065L.newSpannable(charSequence);
        u(context, newSpannable);
        return newSpannable;
    }

    public void setImage(@InterfaceC0578v int i4) {
        f49066M = i4;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(v(getContext(), charSequence), TextView.BufferType.SPANNABLE);
    }

    public HmTextViewWithImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HmTextViewWithImage(Context context) {
        super(context);
    }
}
