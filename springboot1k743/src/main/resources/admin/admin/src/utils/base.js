const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot1k743/",
            name: "springboot1k743",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot1k743/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "口腔管家平台"
        } 
    }
}
export default base
