<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>详情</title>
    <link rel="stylesheet" type="text/css" href="style/common.css" />
    <link rel="stylesheet" type="text/css" href="style/detail.css" />
    <!--<link rel="stylesheet" type="text/css" href="style/reset.css" />
        <link rel="stylesheet" type="text/css" href="style/style.css" />-->
</head>
<body class="bgf8">
<div class="header">
    <div class="logo f1">
        <img src="/image/logo.png">
    </div>
    <div class="auth fr">
        <ul>
            <li><a href="#">登录</a></li>
            <li><a href="#">注册</a></li>
        </ul>
    </div>
</div>
<div class="content">
    <div class="section" style="margin-top:20px;">
        <div class="width1200">
            <div class="fl"><img src="${canvas.smallImg}"/></div>
            <div class="fl sec_intru_bg">
                <dl>
                    <dt>大碗岛上的星期日</dt>
                    <dd>
                        <p>发布人：<span>${canvas.creator}</span></p>
                        <p>发布时间：<span><fmt:formatDate pattern="yyyy年MM月dd日" value="${canvas.createTime}"/></span></p>
                        <p>修改时间：<span><fmt:formatDate pattern="yyyy年MM月dd日" value="${canvas.updateTime}"/></span></p>
                    </dd>
                </dl>
                <ul>
                    <li>售价：<br/><span class="price">${canvas.price}</span>元</li>
                </ul>
            </div>
        </div>
    </div>
    <div class="secion_words">
        <div class="width1200">
            <div class="secion_wordsCon">
                <p>在世界美术史上，印象主义到后来衍生出了“后印象主义”和“新印象主义”两个派别。其中的新印象主义是对印象主义色彩运用的进一步科学化和精确化。我们知道，通过分光镜可以把太阳光分析成七种颜色，印象派只是用这七种混合的原色作画，并注意色彩在不同的光线照射下发生的不同变化。而新印象主义不用混合色，而是通过科学方法将自然中存在的色彩分剖为构成色，用微小的笔触画在画面上，形成小色斑块，靠观赏者眼睛的自然混合产生中间色，并通过色光的混合，增加光量，提高光的反射率和透明度，使颜色的调和达到和谐、鲜明的效果。因而，可以说新印象派把光和色彩运用得更为精确和机械。
                    为完成这幅作品，修拉画了三十多幅习作和色彩稿，花了整整两年时间来绘制了这幅具有纪念碑意义的作品，它是现代艺术的重要事件之一。修拉是根据自己的理论来从事创作的，他力求使画面构图合乎几何学原理，他根据黄金分割法则，将画面中物象的比例，物象与画面大小、形状的关系，垂直线与水平线的平衡，人物角度的配置等，制定出一种全新的构图类型。注重艺术形象静态的特性和体积感，建立了画面的造型秩序。</p>
                <p>
                    画中人物都是按远近透视法安排的，并以数学计算式的精确，递减人物的大小和在深度中进行重复来构成画面，画中领着孩子的妇女正好被置于画面的几何中心点。画面上有大块对比强烈的明暗部分，每一部分都是由上千个并列的互补色小笔触色点组成，使我们的眼睛从前景转向觉得很美的背景，整个画面在色彩的量感中取得了均衡与统一。
                </p>
                <p>
                    在这幅画里画家使用了垂直线和水平线的几何分割关系和色彩分割关系，描绘了盛夏烈日下有40个人在大碗岛游玩的情景，画面上充满一种神奇的空气感，人物只有体积感而无个性和生命感，彼此之间具有神秘莫测的隔绝的特点。
                </p>
                <p>
                    修拉的这幅画预示了塞尚的艺术以及后来的立体主义、抽象主义和超现实主义的问世，使他成为现代艺术的先驱者之一。
                    作品赏析
                    《大碗岛星期天的下午》是新印象主义典型的代表作，也是一幅在世界美术史上具有纪念碑式意义的油画作品。画面上的大腕岛是位于巴黎附近奥尼埃的一个岛上公园，也是巴黎人盛夏理想的避暑胜地。画面上，聚集了许多周末来这儿游玩的人们。画家着意把画面分成了被阳光照射的部分和处于阴凉中的两部分，使画面构成了鲜明的对比。画面上的人物有的站在那里欣赏风景，有的躺卧或坐在地上自娱自乐，有的成双成对地谈笑，有的面对湖面，独自沉默---几只小狗在地上游逛。
                    画面上的人物与周围的湖面、树木等构成了精密和谐的构图，使画面上物象的比例、物象与整个画面的大小、垂直线与平行线的平衡达到了一种理性的和谐和科学秩序下的统一。比如近处阴影下站着的一对高个夫妇与阳光下撑着伞的一对母女以及远处一个正在作画的男士，处于一条水平直线上，而精湛的近大远小的透视法使他们看上去比例和谐、科学，又让人觉得格调明快、有趣，充满活力。当然，与以往的绘画作品比较，这幅画最大的特点就是画面上布满了精密、细致排列的小圆点，这些小圆点是用不加调和的暖、冷色以及相近色、互补色等堆积而成的，在欣赏者一定距离的视角范围内观看，形成了极为鲜艳和饱满的色彩效果。画上的人物形象都不是很清晰，显然这不是画家最关心的，画家刻意追求的就是把众多人物安置在精确的几何图形中，在光线的照射下，使画中的固定人物形成一种奇妙而又特别有秩序的和谐。仔细观看，会觉得画中的人物在各自的位置上形成了一种超越时空的凝重，仿佛各自都必须坚守自己的位置，不能打破某种默契，让人感受到一种理性的不可违抗的井然和秩序。在色彩方面，画中的黄色和橙色占主导地位，黄色与绿色、白色、黑色相互搭配交织，形成了温暖、鲜明的色调，看上去赏心悦目。
                    乔治·修拉极为讲究精密秩序构图的“点彩画法”，使艺术过于科学化，从而失去了艺术本身感性的色彩，使绘画趋于机械和呆板。然而这种大胆的创新尝试，却具有非凡的划时代意义，他的探索深刻地影响了近代艺术的形成，不仅影响了野兽派，也预示了近代几何抽象艺术的出现。
                </p>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <p><span>M-GALLARY</span>©2017 POWERED BY IMOOC.INC</p>
</div>
</div>
</body>
</html>