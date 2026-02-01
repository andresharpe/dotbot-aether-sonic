package i2;

import com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e;
import com.harman.jbl.partylight.lib.biz.Color;
import com.harman.jbl.partylight.lib.biz.LightInfo;
import com.harman.jbl.partylight.lib.biz.Switch;
import com.harman.sdk.utils.k;
import h2.C2062a;
import java.util.ArrayList;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d extends e<com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a> {

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final LightInfo.Pattern f50744c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private final Color f50745d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private final LightInfo.PatternLooping f50746e;

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private final Integer f50747f;

    /* renamed from: g, reason: collision with root package name */
    @l3.e
    private final Integer f50748g;

    /* renamed from: h, reason: collision with root package name */
    @l3.e
    private final C2062a f50749h;

    /* renamed from: i, reason: collision with root package name */
    @l3.e
    private final Integer f50750i;

    /* renamed from: j, reason: collision with root package name */
    @l3.e
    private final Switch f50751j;

    public d() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e, com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    public boolean a() {
        return true;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.e
    public byte[] f() {
        byte[] O5;
        byte[] e4;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte) 0);
        LightInfo.Pattern pattern = this.f50744c;
        if (pattern != null) {
            arrayList.add((byte) 49);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf(pattern.f()));
        }
        Color color = this.f50745d;
        if (color != null) {
            arrayList.add((byte) 50);
            arrayList.add((byte) 3);
            arrayList.add(Byte.valueOf((byte) color.i()));
            arrayList.add(Byte.valueOf((byte) color.h()));
            arrayList.add(Byte.valueOf((byte) color.g()));
        }
        LightInfo.PatternLooping patternLooping = this.f50746e;
        if (patternLooping != null) {
            arrayList.add((byte) 54);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf(patternLooping.f()));
        }
        Integer num = this.f50747f;
        if (num != null) {
            int intValue = num.intValue();
            arrayList.add((byte) 69);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf((byte) intValue));
        }
        Integer num2 = this.f50748g;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            arrayList.add((byte) 70);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf((byte) intValue2));
        }
        C2062a c2062a = this.f50749h;
        if (c2062a != null && (e4 = com.harman.jbl.cd_biz_comm.utils.d.e(c2062a.d())) != null) {
            F.m(e4);
            if (e4.length == 2) {
                arrayList.add(Byte.valueOf(k.f48653d0));
                arrayList.add((byte) 2);
                arrayList.add(Byte.valueOf(e4[0]));
                arrayList.add(Byte.valueOf(e4[1]));
            }
        }
        Integer num3 = this.f50750i;
        if (num3 != null) {
            int intValue3 = num3.intValue();
            arrayList.add((byte) 72);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf((byte) intValue3));
        }
        Switch r12 = this.f50751j;
        if (r12 != null) {
            arrayList.add((byte) 73);
            arrayList.add((byte) 1);
            arrayList.add(Byte.valueOf(r12.f()));
        }
        O5 = D.O5(arrayList);
        return O5;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte h() {
        return (byte) 51;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.e
    public byte i() {
        return (byte) 0;
    }

    @Override // com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.g
    @l3.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a b(@l3.d byte[] respContent) {
        F.p(respContent, "respContent");
        return com.harman.jbl.cd_biz_comm.wireless_tech.blecommander.a.f38062c.a(respContent);
    }

    public /* synthetic */ d(LightInfo.Pattern pattern, Color color, LightInfo.PatternLooping patternLooping, Integer num, Integer num2, C2062a c2062a, Integer num3, Switch r17, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : pattern, (i4 & 2) != 0 ? null : color, (i4 & 4) != 0 ? null : patternLooping, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? null : num2, (i4 & 32) != 0 ? null : c2062a, (i4 & 64) != 0 ? null : num3, (i4 & 128) == 0 ? r17 : null);
    }

    public d(@l3.e LightInfo.Pattern pattern, @l3.e Color color, @l3.e LightInfo.PatternLooping patternLooping, @l3.e Integer num, @l3.e Integer num2, @l3.e C2062a c2062a, @l3.e Integer num3, @l3.e Switch r8) {
        this.f50744c = pattern;
        this.f50745d = color;
        this.f50746e = patternLooping;
        this.f50747f = num;
        this.f50748g = num2;
        this.f50749h = c2062a;
        this.f50750i = num3;
        this.f50751j = r8;
    }
}
