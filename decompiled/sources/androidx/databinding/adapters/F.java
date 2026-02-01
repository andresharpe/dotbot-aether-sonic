package androidx.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;
import androidx.databinding.library.baseAdapters.b;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:autoLink", method = "setAutoLinkMask", type = TextView.class), @androidx.databinding.g(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = TextView.class), @androidx.databinding.g(attribute = "android:editorExtras", method = "setInputExtras", type = TextView.class), @androidx.databinding.g(attribute = "android:inputType", method = "setRawInputType", type = TextView.class), @androidx.databinding.g(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = TextView.class), @androidx.databinding.g(attribute = "android:textAllCaps", method = "setAllCaps", type = TextView.class), @androidx.databinding.g(attribute = "android:textColorHighlight", method = "setHighlightColor", type = TextView.class), @androidx.databinding.g(attribute = "android:textColorHint", method = "setHintTextColor", type = TextView.class), @androidx.databinding.g(attribute = "android:textColorLink", method = "setLinkTextColor", type = TextView.class), @androidx.databinding.g(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = TextView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14025a = "TextViewBindingAdapters";

    /* renamed from: b, reason: collision with root package name */
    public static final int f14026b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14027c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14028d = 5;

    /* loaded from: classes.dex */
    class a implements TextWatcher {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ c f14029E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ d f14030F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14031G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ b f14032H;

        a(c cVar, d dVar, androidx.databinding.o oVar, b bVar) {
            this.f14029E = cVar;
            this.f14030F = dVar;
            this.f14031G = oVar;
            this.f14032H = bVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            b bVar = this.f14032H;
            if (bVar != null) {
                bVar.afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            c cVar = this.f14029E;
            if (cVar != null) {
                cVar.beforeTextChanged(charSequence, i4, i5, i6);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            d dVar = this.f14030F;
            if (dVar != null) {
                dVar.onTextChanged(charSequence, i4, i5, i6);
            }
            androidx.databinding.o oVar = this.f14031G;
            if (oVar != null) {
                oVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void afterTextChanged(Editable editable);
    }

    /* loaded from: classes.dex */
    public interface c {
        void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6);
    }

    /* loaded from: classes.dex */
    public interface d {
        void onTextChanged(CharSequence charSequence, int i4, int i5, int i6);
    }

    @InterfaceC0879d({"android:text"})
    public static void A(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence != null || text.length() != 0) {
                if (charSequence instanceof Spanned) {
                    if (charSequence.equals(text)) {
                        return;
                    }
                } else if (!b(charSequence, text)) {
                    return;
                }
                textView.setText(charSequence);
            }
        }
    }

    @InterfaceC0879d({"android:textSize"})
    public static void B(TextView textView, float f4) {
        textView.setTextSize(0, f4);
    }

    @InterfaceC0879d(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    public static void C(TextView textView, c cVar, d dVar, b bVar, androidx.databinding.o oVar) {
        a aVar;
        if (cVar == null && bVar == null && dVar == null && oVar == null) {
            aVar = null;
        } else {
            aVar = new a(cVar, dVar, oVar, bVar);
        }
        TextWatcher textWatcher = (TextWatcher) r.b(textView, aVar, b.a.f14109c);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }

    @androidx.databinding.n(attribute = "android:text", event = "android:textAttrChanged")
    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    private static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        boolean z3;
        boolean z4;
        if (charSequence == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (charSequence2 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (charSequence.charAt(i4) != charSequence2.charAt(i4)) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC0879d({"android:autoText"})
    public static void c(TextView textView, boolean z3) {
        int i4;
        KeyListener keyListener = textView.getKeyListener();
        TextKeyListener.Capitalize capitalize = TextKeyListener.Capitalize.NONE;
        if (keyListener != null) {
            i4 = keyListener.getInputType();
        } else {
            i4 = 0;
        }
        if ((i4 & 4096) != 0) {
            capitalize = TextKeyListener.Capitalize.CHARACTERS;
        } else if ((i4 & 8192) != 0) {
            capitalize = TextKeyListener.Capitalize.WORDS;
        } else if ((i4 & 16384) != 0) {
            capitalize = TextKeyListener.Capitalize.SENTENCES;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z3, capitalize));
    }

    @InterfaceC0879d({"android:bufferType"})
    public static void d(TextView textView, TextView.BufferType bufferType) {
        textView.setText(textView.getText(), bufferType);
    }

    @InterfaceC0879d({"android:capitalize"})
    public static void e(TextView textView, TextKeyListener.Capitalize capitalize) {
        boolean z3;
        if ((textView.getKeyListener().getInputType() & 32768) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z3, capitalize));
    }

    @InterfaceC0879d({"android:digits"})
    public static void f(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            textView.setKeyListener(DigitsKeyListener.getInstance(charSequence.toString()));
        } else if (textView.getKeyListener() instanceof DigitsKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @InterfaceC0879d({"android:drawableBottom"})
    public static void g(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    @InterfaceC0879d({"android:drawableEnd"})
    public static void h(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    @InterfaceC0879d({"android:drawableLeft"})
    public static void i(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    @InterfaceC0879d({"android:drawableRight"})
    public static void j(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    @InterfaceC0879d({"android:drawableStart"})
    public static void k(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @InterfaceC0879d({"android:drawableTop"})
    public static void l(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    @InterfaceC0879d({"android:imeActionId"})
    public static void m(TextView textView, int i4) {
        textView.setImeActionLabel(textView.getImeActionLabel(), i4);
    }

    @InterfaceC0879d({"android:imeActionLabel"})
    public static void n(TextView textView, CharSequence charSequence) {
        textView.setImeActionLabel(charSequence, textView.getImeActionId());
    }

    @InterfaceC0879d({"android:inputMethod"})
    public static void o(TextView textView, CharSequence charSequence) {
        try {
            textView.setKeyListener((KeyListener) Class.forName(charSequence.toString()).newInstance());
        } catch (ClassNotFoundException e4) {
            Log.e(f14025a, "Could not create input method: " + ((Object) charSequence), e4);
        } catch (IllegalAccessException e5) {
            Log.e(f14025a, "Could not create input method: " + ((Object) charSequence), e5);
        } catch (InstantiationException e6) {
            Log.e(f14025a, "Could not create input method: " + ((Object) charSequence), e6);
        }
    }

    private static void p(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @InterfaceC0879d({"android:lineSpacingExtra"})
    public static void q(TextView textView, float f4) {
        textView.setLineSpacing(f4, textView.getLineSpacingMultiplier());
    }

    @InterfaceC0879d({"android:lineSpacingMultiplier"})
    public static void r(TextView textView, float f4) {
        textView.setLineSpacing(textView.getLineSpacingExtra(), f4);
    }

    @InterfaceC0879d({"android:maxLength"})
    public static void s(TextView textView, int i4) {
        InputFilter[] filters = textView.getFilters();
        if (filters == null) {
            filters = new InputFilter[]{new InputFilter.LengthFilter(i4)};
        } else {
            int i5 = 0;
            while (true) {
                if (i5 < filters.length) {
                    InputFilter inputFilter = filters[i5];
                    if (inputFilter instanceof InputFilter.LengthFilter) {
                        if (((InputFilter.LengthFilter) inputFilter).getMax() != i4) {
                            filters[i5] = new InputFilter.LengthFilter(i4);
                        }
                    } else {
                        i5++;
                    }
                } else {
                    int length = filters.length;
                    InputFilter[] inputFilterArr = new InputFilter[1 + length];
                    System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                    inputFilterArr[length] = new InputFilter.LengthFilter(i4);
                    filters = inputFilterArr;
                    break;
                }
            }
        }
        textView.setFilters(filters);
    }

    @InterfaceC0879d({"android:numeric"})
    public static void t(TextView textView, int i4) {
        boolean z3;
        boolean z4 = false;
        if ((i4 & 3) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i4 & 5) != 0) {
            z4 = true;
        }
        textView.setKeyListener(DigitsKeyListener.getInstance(z3, z4));
    }

    @InterfaceC0879d({"android:password"})
    public static void u(TextView textView, boolean z3) {
        if (z3) {
            textView.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textView.setTransformationMethod(null);
        }
    }

    @InterfaceC0879d({"android:phoneNumber"})
    public static void v(TextView textView, boolean z3) {
        if (z3) {
            textView.setKeyListener(DialerKeyListener.getInstance());
        } else if (textView.getKeyListener() instanceof DialerKeyListener) {
            textView.setKeyListener(null);
        }
    }

    @InterfaceC0879d({"android:shadowColor"})
    public static void w(TextView textView, int i4) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i4);
    }

    @InterfaceC0879d({"android:shadowDx"})
    public static void x(TextView textView, float f4) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), f4, textView.getShadowDy(), shadowColor);
    }

    @InterfaceC0879d({"android:shadowDy"})
    public static void y(TextView textView, float f4) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f4, shadowColor);
    }

    @InterfaceC0879d({"android:shadowRadius"})
    public static void z(TextView textView, float f4) {
        textView.setShadowLayer(f4, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
    }
}
