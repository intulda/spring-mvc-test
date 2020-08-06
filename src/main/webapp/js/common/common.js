
export function onMoveHandler(url) {
    window.location.href = url;
}

class Moles {
    constructor(url) {
        this.url = url;
    }

    onMoveHanlder = () => {
        location.href = this.url;
        console.log(1);
    }
}

export default Moles;