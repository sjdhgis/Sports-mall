const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot9c7k3/",
            name: "springboot9c7k3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot9c7k3/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于SpringBoot的体育用品交易平台"
        } 
    }
}
export default base
