

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

                this.hostPerSubnet.sort((a,b) => {
                    return b - a })


                for (let index = 0; index <= this.numberOfSubnet; index++) {
                    // console.log()

                    borrowed_bits = 2;
                    power = 0;
                    while (power < this.hostPerSubnet[index]) {
                        power = Math.pow(2,borrowed_bits);
                        borrowed_bits++;
                    }


                    cidr = 32 - borrowed_bits;
                    
                    increments = Math.pow(2, borrowed_bits - 1)

                    console.log(increments)


                }


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
x.hostPerSubnet = [5,32,200,21,12]
x.calc();