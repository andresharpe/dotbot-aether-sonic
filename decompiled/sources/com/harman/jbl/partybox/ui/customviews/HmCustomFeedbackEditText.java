package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes2.dex */
public class HmCustomFeedbackEditText extends HmCustomFontEditText {
    public HmCustomFeedbackEditText(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.C0600m, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i4 = editorInfo.imeOptions;
        int i5 = i4 & 255;
        if ((i4 & 6) != 0) {
            editorInfo.imeOptions = (i4 ^ i5) | 6;
        }
        int i6 = editorInfo.imeOptions;
        if ((1073741824 & i6) != 0) {
            editorInfo.imeOptions = i6 & (-1073741825);
        }
        return onCreateInputConnection;
    }

    public HmCustomFeedbackEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HmCustomFeedbackEditText(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
