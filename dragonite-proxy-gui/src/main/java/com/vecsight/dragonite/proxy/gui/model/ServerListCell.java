/*
 * VECTORSIGHT CONFIDENTIAL
 * ------------------------
 * Copyright (c) [2015] - [2017]
 * VectorSight Systems Co., Ltd.
 * All Rights Reserved.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Written by Toby Huang <t@vecsight.com>, June 2017
 */

package com.vecsight.dragonite.proxy.gui.model;

import javafx.scene.control.ListCell;

public class ServerListCell extends ListCell<ServerListCellInfo> {

    private ServerListCellInfo item;

    @Override
    protected void updateItem(final ServerListCellInfo item, final boolean empty) {
        super.updateItem(item, empty);
        if (item != null) {
            this.item = item;
            setGraphic(item.updateAndGetCell());
        }
    }
}
