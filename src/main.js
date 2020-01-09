

function network() {
    return {
        // console.log('x')
        ip: '10.10.10.10',
        __netmask: '',
        __broadcast: '',
        numberOfSubnet: 1,
        hostPerSubnet: [],

        calc: function() {
            if(this.hostPerSubnet.length == this.numberOfSubnet) {

            } else {
                console.log({
                    message: "Number of subnet is not equal to host per network"
                });
            }
        }
    }
}

const x =  new network;

x.ip = "192.168.0.1"
x.numberOfSubnet = 5
x.hostPerSubnet = [5,32,200,21,]
console.log(x.calc());