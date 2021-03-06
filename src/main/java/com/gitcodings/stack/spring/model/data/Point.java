package com.gitcodings.stack.spring.model.data;

public class Point
{
    private Integer x;
    private Integer y;

    public Integer getX()
    {
        return x;
    }

    public Point setX(Integer x)
    {
        this.x = x;
        return this;
    }

    public Integer getY()
    {
        return y;
    }

    public Point setY(Integer y)
    {
        this.y = y;
        return this;
    }

    @Override
    public String toString()
    {
        return String.format("(%s,%s)", x, y);
    }
}
