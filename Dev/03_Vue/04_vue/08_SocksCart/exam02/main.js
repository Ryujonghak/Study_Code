// const product = 'Socks';
const app = Vue.createApp(
    {
        data() { // 변수 정의
            return {
                // 속성값 정의 위치
                cart: 0,
                product: 'Socks',
                image: './asset/images/socks_green.jpeg', // 초기 이미지 경로
                inStock: true,
                details: ['50% cotton', '30% wool', '20% polyester'],
                variants: [
                    { id: 2234, color: 'green', image: './asset/images/socks_green.jpeg' },
                    { id: 2235, color: 'blue', image: './asset/images/socks_blue.jpeg' }
                ],
                sizes: [10, 20],
            }
        },
        methods: {
            addToCart() {
                this.cart += 1;
            },
            delToCart() {
                if (this.cart != 0) {
                    this.cart -= 1;
                } else { alert("Cart is empty") }
            },
            updateImage(variantImage) {
                this.image = variantImage;
            }
        },
        computed: {
            title() {
                return "Vue Mastery" + ' ' + this.product;
            },
            saleMessage() {
                return this.product + " is on Sale";
            }
        }
    }
)