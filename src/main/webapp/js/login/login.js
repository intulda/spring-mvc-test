import {onMoveHandler} from "../common/common";
import Moles from "../common/common";


function moveNaver(e) {
    const mole = new Moles("www.naver.com");
    mole.onMoveHanlder();
    onMoveHandler("www.naver.com");
}