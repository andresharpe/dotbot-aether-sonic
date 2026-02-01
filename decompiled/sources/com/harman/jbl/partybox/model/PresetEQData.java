package com.harman.jbl.partybox.model;

import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.F;

@E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004\"\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/harman/jbl/partybox/model/PresetEQData;", "Ljava/io/Serializable;", "Lcom/harman/jbl/partybox/model/a;", "a", "()Lcom/harman/jbl/partybox/model/a;", "Lcom/harman/jbl/partybox/model/d;", com.harman.log.b.f47574c, "()Lcom/harman/jbl/partybox/model/d;", "categoryModel", "presetEQValueModel", "c", "(Lcom/harman/jbl/partybox/model/a;Lcom/harman/jbl/partybox/model/d;)Lcom/harman/jbl/partybox/model/PresetEQData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "Lcom/harman/jbl/partybox/model/a;", "e", "g", "(Lcom/harman/jbl/partybox/model/a;)V", "F", "Lcom/harman/jbl/partybox/model/d;", "f", "h", "(Lcom/harman/jbl/partybox/model/d;)V", "<init>", "(Lcom/harman/jbl/partybox/model/a;Lcom/harman/jbl/partybox/model/d;)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PresetEQData implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private a f42037E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private d f42038F;

    public PresetEQData(@l3.d a categoryModel, @l3.d d presetEQValueModel) {
        F.p(categoryModel, "categoryModel");
        F.p(presetEQValueModel, "presetEQValueModel");
        this.f42037E = categoryModel;
        this.f42038F = presetEQValueModel;
    }

    public static /* synthetic */ PresetEQData d(PresetEQData presetEQData, a aVar, d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = presetEQData.f42037E;
        }
        if ((i4 & 2) != 0) {
            dVar = presetEQData.f42038F;
        }
        return presetEQData.c(aVar, dVar);
    }

    @l3.d
    public final a a() {
        return this.f42037E;
    }

    @l3.d
    public final d b() {
        return this.f42038F;
    }

    @l3.d
    public final PresetEQData c(@l3.d a categoryModel, @l3.d d presetEQValueModel) {
        F.p(categoryModel, "categoryModel");
        F.p(presetEQValueModel, "presetEQValueModel");
        return new PresetEQData(categoryModel, presetEQValueModel);
    }

    @l3.d
    public final a e() {
        return this.f42037E;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresetEQData)) {
            return false;
        }
        PresetEQData presetEQData = (PresetEQData) obj;
        return F.g(this.f42037E, presetEQData.f42037E) && F.g(this.f42038F, presetEQData.f42038F);
    }

    @l3.d
    public final d f() {
        return this.f42038F;
    }

    public final void g(@l3.d a aVar) {
        F.p(aVar, "<set-?>");
        this.f42037E = aVar;
    }

    public final void h(@l3.d d dVar) {
        F.p(dVar, "<set-?>");
        this.f42038F = dVar;
    }

    public int hashCode() {
        return (this.f42037E.hashCode() * 31) + this.f42038F.hashCode();
    }

    @l3.d
    public String toString() {
        return "PresetEQData(categoryModel=" + this.f42037E + ", presetEQValueModel=" + this.f42038F + ")";
    }
}
