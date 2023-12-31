package com.example.template.utils

object Interfaces {

    interface ClickItemSelect{
        fun itemSelect(value: Any)
    }

    interface ClickItemSelectType{
        fun onClickItemType(data: Any, value: Any)
    }

    interface ConfirmAction {
        fun onConfirm()
    }
}