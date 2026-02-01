package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* loaded from: classes.dex */
public class o extends g<DocumentData> {
    public o(List<com.airbnb.lottie.value.a<DocumentData>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public DocumentData i(com.airbnb.lottie.value.a<DocumentData> aVar, float f4) {
        DocumentData documentData;
        if (f4 == 1.0f && (documentData = aVar.f23313c) != null) {
            return documentData;
        }
        return aVar.f23312b;
    }
}
