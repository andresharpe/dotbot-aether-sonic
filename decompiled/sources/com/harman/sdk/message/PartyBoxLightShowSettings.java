package com.harman.sdk.message;

import androidx.constraintlayout.core.motion.utils.v;
import com.harman.log.b;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.ColorMode;
import com.harman.sdk.utils.CustomLightPattern;
import com.harman.sdk.utils.LightElements;
import com.harman.sdk.utils.LightPattern;
import com.harman.sdk.utils.SoloPattern;
import com.harman.sdk.utils.SoloPatternMode;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.E;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bd\u0010eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00103\u001a\b\u0012\u0004\u0012\u00020/0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010I\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\u0004\"\u0004\bG\u0010HR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010(\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010(\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010X\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010(\u001a\u0004\bV\u0010M\"\u0004\bW\u0010OR\"\u0010\\\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010E\u001a\u0004\bZ\u0010\u0004\"\u0004\b[\u0010HR\"\u0010c\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b¨\u0006f"}, d2 = {"Lcom/harman/sdk/message/PartyBoxLightShowSettings;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Lcom/harman/sdk/utils/LightPattern;", androidx.exifinterface.media.a.U4, "Lcom/harman/sdk/utils/LightPattern;", "a", "()Lcom/harman/sdk/utils/LightPattern;", "o", "(Lcom/harman/sdk/utils/LightPattern;)V", "activePattern", "", "Lcom/harman/sdk/utils/LightElements;", "", "F", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "w", "(Ljava/util/Map;)V", "lightElementsMap", "Lcom/harman/sdk/utils/ColorMode;", "G", "Lcom/harman/sdk/utils/ColorMode;", "d", "()Lcom/harman/sdk/utils/ColorMode;", "r", "(Lcom/harman/sdk/utils/ColorMode;)V", "colorMode", "", "H", "Ljava/util/List;", "f", "()Ljava/util/List;", "t", "(Ljava/util/List;)V", "inactivePatternList", "Lcom/harman/sdk/utils/Color;", "I", "Lcom/harman/sdk/utils/Color;", "c", "()Lcom/harman/sdk/utils/Color;", "q", "(Lcom/harman/sdk/utils/Color;)V", v.b.f7402d, "Lcom/harman/sdk/utils/CustomLightPattern;", "J", "e", "s", "customLightPatternList", "Lcom/harman/sdk/utils/SoloPattern;", "K", "Lcom/harman/sdk/utils/SoloPattern;", "j", "()Lcom/harman/sdk/utils/SoloPattern;", "x", "(Lcom/harman/sdk/utils/SoloPattern;)V", "soloPattern", "Lcom/harman/sdk/utils/SoloPatternMode;", "L", "Lcom/harman/sdk/utils/SoloPatternMode;", "k", "()Lcom/harman/sdk/utils/SoloPatternMode;", "y", "(Lcom/harman/sdk/utils/SoloPatternMode;)V", "soloPatternMode", "M", "Ljava/lang/String;", "n", "B", "(Ljava/lang/String;)V", "supportPatternId", "", "N", "m", "()I", androidx.exifinterface.media.a.Y4, "(I)V", "stageNumber", "O", "h", "v", "lightBrightness", "P", "g", "u", "lEDMovementSpeed", "Q", "l", "z", "speakerIDtoLight", "R", "Z", b.f47574c, "()Z", "p", "(Z)V", "batterySavingMode", "<init>", "()V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PartyBoxLightShowSettings implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @d
    private LightPattern f48278E = LightPattern.OFF;

    /* renamed from: F, reason: collision with root package name */
    @d
    private Map<LightElements, Boolean> f48279F = new LinkedHashMap();

    /* renamed from: G, reason: collision with root package name */
    @d
    private ColorMode f48280G = ColorMode.COLOR_LOOP;

    /* renamed from: H, reason: collision with root package name */
    @d
    private List<? extends LightPattern> f48281H;

    /* renamed from: I, reason: collision with root package name */
    @e
    private Color f48282I;

    /* renamed from: J, reason: collision with root package name */
    @d
    private List<CustomLightPattern> f48283J;

    /* renamed from: K, reason: collision with root package name */
    @d
    private SoloPattern f48284K;

    /* renamed from: L, reason: collision with root package name */
    @d
    private SoloPatternMode f48285L;

    /* renamed from: M, reason: collision with root package name */
    @e
    private String f48286M;

    /* renamed from: N, reason: collision with root package name */
    private int f48287N;

    /* renamed from: O, reason: collision with root package name */
    private int f48288O;

    /* renamed from: P, reason: collision with root package name */
    private int f48289P;

    /* renamed from: Q, reason: collision with root package name */
    @d
    private String f48290Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f48291R;

    public PartyBoxLightShowSettings() {
        List<? extends LightPattern> H3;
        List<CustomLightPattern> H4;
        H3 = CollectionsKt__CollectionsKt.H();
        this.f48281H = H3;
        H4 = CollectionsKt__CollectionsKt.H();
        this.f48283J = H4;
        this.f48284K = SoloPattern.PATTERN_OFF;
        this.f48285L = SoloPatternMode.OFF;
        this.f48290Q = "";
    }

    public final void A(int i4) {
        this.f48287N = i4;
    }

    public final void B(@e String str) {
        this.f48286M = str;
    }

    @d
    public final LightPattern a() {
        return this.f48278E;
    }

    public final boolean b() {
        return this.f48291R;
    }

    @e
    public final Color c() {
        return this.f48282I;
    }

    @d
    public final ColorMode d() {
        return this.f48280G;
    }

    @d
    public final List<CustomLightPattern> e() {
        return this.f48283J;
    }

    @d
    public final List<LightPattern> f() {
        return this.f48281H;
    }

    public final int g() {
        return this.f48289P;
    }

    public final int h() {
        return this.f48288O;
    }

    @d
    public final Map<LightElements, Boolean> i() {
        return this.f48279F;
    }

    @d
    public final SoloPattern j() {
        return this.f48284K;
    }

    @d
    public final SoloPatternMode k() {
        return this.f48285L;
    }

    @d
    public final String l() {
        return this.f48290Q;
    }

    public final int m() {
        return this.f48287N;
    }

    @e
    public final String n() {
        return this.f48286M;
    }

    public final void o(@d LightPattern lightPattern) {
        F.p(lightPattern, "<set-?>");
        this.f48278E = lightPattern;
    }

    public final void p(boolean z3) {
        this.f48291R = z3;
    }

    public final void q(@e Color color) {
        this.f48282I = color;
    }

    public final void r(@d ColorMode colorMode) {
        F.p(colorMode, "<set-?>");
        this.f48280G = colorMode;
    }

    public final void s(@d List<CustomLightPattern> list) {
        F.p(list, "<set-?>");
        this.f48283J = list;
    }

    public final void t(@d List<? extends LightPattern> list) {
        F.p(list, "<set-?>");
        this.f48281H = list;
    }

    @d
    public String toString() {
        return "PartyBoxLightShowSettings{activePattern='" + this.f48278E + "', lightElementsMap='" + this.f48279F + "', colorMode=" + this.f48280G + ", supportPatternId=" + this.f48286M + ", inactivePatternList=" + this.f48281H + ", color=" + this.f48282I + ", lightBrightness=" + this.f48288O + ", lEDMovementSpeed=" + this.f48289P + ", speakerIDtoLight=" + this.f48290Q + ", batterySavingMode=" + this.f48291R + "}";
    }

    public final void u(int i4) {
        this.f48289P = i4;
    }

    public final void v(int i4) {
        this.f48288O = i4;
    }

    public final void w(@d Map<LightElements, Boolean> map) {
        F.p(map, "<set-?>");
        this.f48279F = map;
    }

    public final void x(@d SoloPattern soloPattern) {
        F.p(soloPattern, "<set-?>");
        this.f48284K = soloPattern;
    }

    public final void y(@d SoloPatternMode soloPatternMode) {
        F.p(soloPatternMode, "<set-?>");
        this.f48285L = soloPatternMode;
    }

    public final void z(@d String str) {
        F.p(str, "<set-?>");
        this.f48290Q = str;
    }
}
