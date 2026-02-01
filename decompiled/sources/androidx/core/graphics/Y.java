package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.f;
import androidx.core.provider.h;
import java.io.IOException;
import java.io.InputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@androidx.annotation.W(ConstraintLayout.b.a.f9571D)
/* loaded from: classes.dex */
public class Y extends Z {
    private Font o(@androidx.annotation.N FontFamily fontFamily, int i4) {
        int i5;
        int i6;
        if ((i4 & 1) != 0) {
            i5 = v.h.f7546j;
        } else {
            i5 = 400;
        }
        if ((i4 & 2) != 0) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        FontStyle fontStyle = new FontStyle(i5, i6);
        Font font = fontFamily.getFont(0);
        int p4 = p(fontStyle, font.getStyle());
        for (int i7 = 1; i7 < fontFamily.getSize(); i7++) {
            Font font2 = fontFamily.getFont(i7);
            int p5 = p(fontStyle, font2.getStyle());
            if (p5 < p4) {
                font = font2;
                p4 = p5;
            }
        }
        return font;
    }

    private static int p(@androidx.annotation.N FontStyle fontStyle, @androidx.annotation.N FontStyle fontStyle2) {
        int i4;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i4 = 0;
        } else {
            i4 = 2;
        }
        return abs + i4;
    }

    @Override // androidx.core.graphics.Z
    @androidx.annotation.P
    public Typeface b(Context context, f.d dVar, Resources resources, int i4) {
        try {
            FontFamily.Builder builder = null;
            for (f.e eVar : dVar.a()) {
                try {
                    Font build = new Font.Builder(resources, eVar.b()).setWeight(eVar.e()).setSlant(eVar.f() ? 1 : 0).setTtcIndex(eVar.c()).setFontVariationSettings(eVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(o(build2, i4).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.Z
    @androidx.annotation.P
    public Typeface d(Context context, @androidx.annotation.P CancellationSignal cancellationSignal, @androidx.annotation.N h.c[] cVarArr, int i4) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (h.c cVar : cVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(cVar.d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(cVar.e()).setSlant(cVar.f() ? 1 : 0).setTtcIndex(cVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(o(build2, i4).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.Z
    public Typeface e(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.Z
    @androidx.annotation.P
    public Typeface f(Context context, Resources resources, int i4, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.core.graphics.Z
    @androidx.annotation.N
    public Typeface g(@androidx.annotation.N Context context, @androidx.annotation.N Typeface typeface, int i4, boolean z3) {
        return Typeface.create(typeface, i4, z3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.Z
    public h.c l(h.c[] cVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
