package com.ims.domain;

import java.util.List;

/**
 * Created by Marquis on 7/6/2017.
 */
public class FullPO
{
    private PurchaseOrder po;
    private List<PurchaseOrderLine> pols;

    public PurchaseOrder getPo() {
        return po;
    }

    public void setPo(PurchaseOrder po) {
        this.po = po;
    }

    public List<PurchaseOrderLine> getPols() {
        return pols;
    }

    public void setPols(List<PurchaseOrderLine> pols) {
        this.pols = pols;
    }


}
